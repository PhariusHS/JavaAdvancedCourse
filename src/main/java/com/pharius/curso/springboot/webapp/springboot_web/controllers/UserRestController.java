package com.pharius.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserRestController {

      @GetMapping("/detailsjson")
    public Map<String, Object> details() {

        Map<String, Object> body = new HashMap<>();


        body.put("title", "HOLA MUNDO HACE MUCHO NO USO HTML!!!!!");
        body.put("nameUser", "Juan Martin");
        body.put("lastNameUser", "Hernandez");
      


        return body;
    }

}
