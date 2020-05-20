package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	//instanciamiento muy complejo, usar la anotacion Autowired en LibraryService
	//LibraryService libraryService = new LibraryService(new BookService(), new BookRepository());

}
