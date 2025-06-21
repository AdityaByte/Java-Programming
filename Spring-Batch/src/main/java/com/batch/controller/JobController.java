package com.batch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobLauncher jobLauncher; // we need that for launching the jobs.

    @Autowired
    private Job job;

    @PostMapping("/importCustomers")
    public void importCsvToDBJob() {
        try {
            // For launching the jobs as the job object we need the Job Parameters objects.
            JobParameters jobParameters = new JobParametersBuilder()
                    .addLong("startAt", System.currentTimeMillis()) // Job parameters needs a time to start.
                    .toJobParameters();

            jobLauncher.run(job, jobParameters);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
