package com.pharius.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharius.curso.springboot.webapp.springboot_web.models.User;
import com.pharius.curso.springboot.webapp.springboot_web.models.UserDTO;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class UserRestController {

    User user = new User((long) 1, "Juan Martin", "Hernandez", "dasda");
    User user1 = new User((long) 2, "Juan ", "perez", "dasdsa");
    User user2 = new User((long) 3, "Juan", "Doe", "dawfas");

    List<User> users = new ArrayList<>();

    @GetMapping("/user")
    public UserDTO details() {

        UserDTO userDTO = new UserDTO("This is a userDTO", user.getName(), user.getLastName());

        return userDTO;
    }

    @GetMapping("/list")
    public List<User> getAllUsers() {

        users = Arrays.asList(user, user1, user2);

        return users;

    }


    @GetMapping("/params")
    public UserDTO getUserWithParameters(@RequestParam String name, String lastName) { //Could be (required= false) / have defaultValue

        UserDTO userDto = new UserDTO(name, lastName);  


        return userDto;
    }



    @GetMapping("/servlets")
    public UserDTO getUserWithServlets(HttpServletRequest request ) {// get user object with servlets httprequest


        UserDTO userDTO = new UserDTO();
        
        userDTO.setName(request.getParameter("name"));
        userDTO.setLastName(request.getParameter("lastName"));

        return userDTO;
    }


    @GetMapping("/pathvariable/{name}") //Passing the parameter with the url/
    public UserDTO passParameterWithPathVariable(@PathVariable String name) {
        
        UserDTO userDTO = new UserDTO();
        userDTO.setName(name);
        return userDTO;

    }
    
    

    @GetMapping("/pathvariables/{name}/{lastName}")//Passing the parameters with the url/
    public Map<String, Object> passParametersWithPathVariables(@PathVariable String name, @PathVariable String lastName) {
        
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("map", name);
        userMap.put("lastName", lastName);

        return userMap;
    }
    
    

    @PostMapping("/post") // make a new user
    public User postMethodName(@RequestBody User user) {
        
        //database logic to save the new user
        return user;
    }
    
    

}
