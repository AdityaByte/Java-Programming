package com.batch.config;

import com.batch.entity.Customer;
import com.batch.repository.CustomerRepository;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class SpringBatchConfig {

    // The three components that you need to remember in the spring batch.
    // 1. Item Reader.
    // 2. Item Processor.
    // 3. Item Writer.
    // Note: we no longer need the EnableBatchProcessing annotation and the JobFactory and StepFactory.

    @Autowired
    private CustomerRepository customerRepository;

    // Here we are creating the ItemReader for reading the data from the source.
    @Bean
    public FlatFileItemReader<Customer> reader() {
        FlatFileItemReader<Customer> itemReader = new FlatFileItemReader<>();
        // Specifying the source file path.
        itemReader.setResource(new FileSystemResource("src/main/resources/customers.csv"));
        // Setting the name, name could be anything.
        itemReader.setName("csv-reader");
        // Specifying to skip the first line which is not the data just a heading.
        itemReader.setLinesToSkip(1);
        itemReader.setLineMapper(lineMapper());
        return itemReader;
    }

    // Line Mapper is used for mapping the lines to the Object which was provided
    // in our case this is the Customer object, and we have to also specify the delimetter too.
    // Here we are creating the ItemReader Object.
    @Bean
    public LineMapper<Customer> lineMapper() {
        DefaultLineMapper<Customer> lineMapper = new DefaultLineMapper<>();

        // Line tokenizer will extract the values from the CSV files.
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setDelimiter(",");
        delimitedLineTokenizer.setStrict(false);
        delimitedLineTokenizer.setNames("id", "firstName", "lastName", "email", "gender", "contactNo", "country", "dob");

        // Field set mapper maps those values to the object.
        BeanWrapperFieldSetMapper<Customer> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(Customer.class);

        // So after that we need to specify both the objects to the linemapper.
        lineMapper.setLineTokenizer(delimitedLineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);

        return lineMapper;
    }


    // This is the Item Processor.

    @Bean
    public CustomerProcessor processor() {
        return new CustomerProcessor();
    }

    // Now we need to define the Item Writer.
    @Bean
    public RepositoryItemWriter<Customer> writer() {
        RepositoryItemWriter<Customer> itemWriter = new RepositoryItemWriter<>();
        // In the Item Writer whatever the value we get from the processor
        // Use my repository to write that data to the database.
        itemWriter.setRepository(customerRepository);
        // Here we're defining the method name to just use the save method for writing the data to db.
        itemWriter.setMethodName("saveAndFlush");
        return itemWriter;
    }

    // Step Object
    @Bean
    public Step step(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("csv-step", jobRepository) // Just setting up the name.
                .<Customer, Customer>chunk(10, transactionManager) // Setting the chunk size in how many size of batch we have to process the data.
                .reader(reader()) // as per mentioned in theory step wants three things - reader
                .processor(processor()) // - processor
                .writer(writer()) // and the writer
                .taskExecutor(taskExecutor())
                .build();
    }

    // Job object
    @Bean
    public Job runJob(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager) {
        return new JobBuilder("importCustomers", jobRepository) // Name of the job
                .flow(step(jobRepository, platformTransactionManager)) // Here we have to give the step.
                // You can give more step to it using the .next(step2()) method like this.
                .end()
                .build();
    }

    @Bean
    public TaskExecutor taskExecutor() {
        SimpleAsyncTaskExecutor asyncTaskExecutor = new SimpleAsyncTaskExecutor();
        asyncTaskExecutor.setConcurrencyLimit(10);
        return asyncTaskExecutor;
    }

}
