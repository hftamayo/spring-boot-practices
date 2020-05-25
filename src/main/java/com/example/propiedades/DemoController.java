package com.example.propiedades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//anotacion para definir que la clase es un EndPoint
@RestController
public class DemoController {

    private static String MENSAJE = "Hola Mundo desde EndPoint con Postman";
    private final String propiedadMensaje;

    @Autowired
    public DemoController(@Value("$(demo.frase)") String propiedadMensaje){
        this.propiedadMensaje = propiedadMensaje;
    }

    //endpoint para el uso de properties
    @RequestMapping(value = "/property/frase", method = RequestMethod.GET)
    public String propiedadMensaje(){
        return propiedadMensaje;
    }

    //endppoint para hacer de esta funcion un endPoint
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
