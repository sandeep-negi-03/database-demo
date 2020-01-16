package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
/*public class SpringJdbcDemoApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All Users : {} ",dao.findAll());
		logger.info("User Id 10001 : {}", dao.findbyId(10001));
		logger.info("User Id to delete 10003 : {}", dao.deletebyId(10003));
		
		logger.info("Inserting Person 10004 : ", dao.insert(
					new Person(10004, "Tara", "Berling", new Date())));
		
		logger.info("Updating Person 10002 : ", dao.update(
				new Person(10002, "Bond", "UK", new Date())));
		
		logger.info("All Users : {} ",dao.findAll());
	}

}*/
