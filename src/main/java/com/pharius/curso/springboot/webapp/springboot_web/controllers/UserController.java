package com.pharius.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {


    @GetMapping("/details")
    public String details(Model model) {

        model.addAttribute("title", "HOLA MUNDO HACE MUCHO NO USO HTML!!!!!");
        model.addAttribute("nameUser", "Juan Martin");
        model.addAttribute("lastNameUser", "Hernandez");



        return "details";
    }

}
