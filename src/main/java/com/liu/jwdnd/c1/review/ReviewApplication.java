package com.liu.jwdnd.c1.review;

import com.liu.jwdnd.c1.review.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	//  // no longer needed
//	@Bean
//	public String message() {
//		System.out.println("Creating message bean");
//		return "Hello, Spring!";
//	}
//
//	@Bean
//	public String uppercaseMessage(MessageService messageService) {
//		System.out.println("Creating uppercaseMessage bean");
//		return messageService.uppercase();
//	}
//
//	@Bean
//	public String lowercaseMessage(MessageService messageService) {
//		System.out.println("Creating lowercaseMessage bean");
//		return messageService.lowercase();
//	}


}
