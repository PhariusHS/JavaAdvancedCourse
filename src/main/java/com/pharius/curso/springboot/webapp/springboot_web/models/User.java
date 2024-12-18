package com.pharius.curso.springboot.webapp.springboot_web.models;



public class User {
    

    private Long id;
    private String name;
    private String lastName;
    private String email ;


    public User(Long id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }


    



    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }






    public User() {
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    


}
