package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryService {

    private BookService bookService;
    private BookRepository bookRepository;

    //anotacion para generar una instancia con el siguiente constructor de la clase
    // constructor based Injection

    /*
    @Autowired
    public LibraryService() {
        this.bookService = bookService;
        this.bookRepository = bookRepository;
        System.out.println("Objeto LibraryService Creado");
    }
*/
    public LibraryService() {
    }

    //setter based injection
    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
        System.out.println("BookService creado por dependency injection");
    }

    //setter based injection
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookRepository creado por dependency injection");
    }
}
