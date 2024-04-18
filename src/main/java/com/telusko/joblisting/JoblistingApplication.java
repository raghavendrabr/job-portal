package com.telusko.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JoblistingApplication {

	public static void main(String[] args) {
		System.out.println("Started");

		SpringApplication.run(JoblistingApplication.class, args);
		System.out.println("ended");

	}

}
