package com.example.epoint;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//anotacion para definir que la clase es un EndPoint
@RestController
public class DemoController {

    private static String MENSAJE = "Hola Mundo desde EndPoint con Postman";

    //anotacion para hacer de esta funcion un endPoint
    @RequestMapping(value = "/saludo", method = RequestMethod.GET)
    public String saludo(){

        return MENSAJE;
    }

    //endpoint para actualizar el valor de la variable mensaje
    @RequestMapping(value = "/actualizar/mensaje", method = RequestMethod.POST)
    public void actualizarMensaje(@RequestBody String xmensaje){
        MENSAJE = xmensaje;
    }
}
