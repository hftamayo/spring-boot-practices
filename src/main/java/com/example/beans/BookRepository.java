package com.example.beans;

import java.util.List;

public class BookRepository {

    public List<String> findBookTitles(){
        return List.of("El Señor de los Anillos", "Fornite");
    }
}
