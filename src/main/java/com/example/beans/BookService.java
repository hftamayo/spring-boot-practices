package com.example.beans;

public class BookService {
    public String findAuthor(final String bookName){
        if(bookName.equals("El Señor de los Anillos")){
            return "J. J. Rowling";
        }
        if(bookName.equals("Fortnite")){
            return "Epic Games";
        }
        return "";
    }
}
