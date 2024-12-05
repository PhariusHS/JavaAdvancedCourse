package com.pharius.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.pharius.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("Juan", "Popobich");

        model.addAttribute("title", "HOLA MUNDO HACE MUCHO NO USO HTML!!!!!");

        model.addAttribute("User", user);

        return "details";
    }

    @GetMapping("/list")
    public String getAllUsers(ModelMap model) {

        model.addAttribute("title", "LISTING");

        return "list";
    }

    @ModelAttribute("users") // Guarda el modelo "users" para poder ser utilizado en thymeleaf
    public List<User> usersModel() {

        User user = new User((long) 1, "Juan Martin", "Hernandez", "dasda");
        User user1 = new User((long) 2, "Juan ", "perez", "dasdsa");
        User user2 = new User((long) 3, "Juan", "Doe", "dawfas");
        List<User> users = new ArrayList<>();
        users = Arrays.asList(user, user1, user2);

        return users;
    }

}
