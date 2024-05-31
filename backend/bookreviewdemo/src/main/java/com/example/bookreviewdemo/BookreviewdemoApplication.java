package com.example.bookreviewdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookreviewdemoApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookreviewdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// 기본 책 데이터 추가
		bookRepository.save(new Book(null, "Spring Boot Guide", "John Doe", "Programming", 10));
		bookRepository.save(new Book(null, "Java Fundamentals", "Jane Doe", "Programming", 5));
	}
}