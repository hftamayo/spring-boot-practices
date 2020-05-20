package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    public DemoBean(){
        System.out.println("Constructor del Bean ejecutado");
    }
}
