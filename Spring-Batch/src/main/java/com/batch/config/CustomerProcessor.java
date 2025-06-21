package com.batch.config;

// This class is the Item processor

import com.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

// In the item processor generic we need to give two things.
// Input class and the output class in our case we are inputting the Customer and taking the
// Customer as output.
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer item) throws Exception {
        // Right now we are processing the Item just returning the object.
        return item;
    }

    // Now we need to specify the CustomerProcessor class to the SpringBatchConfig class.
}
