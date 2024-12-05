package com.pharius.curso.springboot.webapp.springboot_web.models;

public class UserDTO {

    private String title;
    private String name;
    private String lastName;






    
    public UserDTO(String title, String name, String lastName) {
        this.title = title;
        this.name = name;
        this.lastName = lastName;
    }


    

    public UserDTO(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public UserDTO(){
        
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    




}
