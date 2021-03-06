package com.in28minutes.database.databasedemo;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User Id 10001 : {}", repository.findById(10001));
		
		  logger.info("Inserting Person : ", repository.save( new Person(10004,
		  "Tara", "Berling", new Date())));
		  
		  logger.info("Updating Person 10002 : ", repository.save( new Person(10002, "Bond",
		  "UK", new Date())));
		  
		  repository.deleteById(10003);
		  logger.info("All Users : {} ",repository.findAll());
	}

}
