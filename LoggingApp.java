package com.client;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.HelloWorld;

public class LoggingApp {
	   static Logger log = Logger.getLogger(LoggingApp.class.getName());
	   
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      log.info("Going to create HelloWord Obj");
	      HelloWorld obj = (HelloWorld) context.getBean("hello");
	      
	      
	      log.info("Exiting the program");
	   }
	}
