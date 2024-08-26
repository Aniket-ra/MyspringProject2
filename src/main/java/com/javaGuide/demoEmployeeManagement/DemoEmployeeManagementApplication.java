package com.javaGuide.demoEmployeeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class DemoEmployeeManagementApplication {

	public static void main(String[] args) {
		
		Dotenv dotenv = Dotenv.load();

        // Set environment variables
        System.setProperty("DATASOURCE_URL", dotenv.get("DATASOURCE_URL"));
        System.setProperty("DATASOURCE_USERNAME", dotenv.get("DATASOURCE_USERNAME"));
        System.setProperty("DATASOURCE_PASSWORD", dotenv.get("DATASOURCE_PASSWORD"));

		SpringApplication.run(DemoEmployeeManagementApplication.class, args);
	}

}
