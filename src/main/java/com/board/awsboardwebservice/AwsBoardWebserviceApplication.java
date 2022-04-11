package com.board.awsboardwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AwsBoardWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsBoardWebserviceApplication.class, args);
	}

}
