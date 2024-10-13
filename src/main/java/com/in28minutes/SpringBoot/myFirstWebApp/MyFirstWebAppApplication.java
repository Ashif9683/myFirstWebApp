package com.in28minutes.SpringBoot.myFirstWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class })
//(scanBasePackages = "com.in28minutes.SpringBoot.myFirstWebApp")
//@EnableJpaRepositories(basePackages = "com.in28minutes.SpringBoot.myFirstWebApp.todo")
public class MyFirstWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebAppApplication.class, args);
	}

}