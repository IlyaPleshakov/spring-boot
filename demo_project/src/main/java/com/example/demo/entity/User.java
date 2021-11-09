package com.example.springmvc.entity;


import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Component("userBean")
@Entity
@Table
public class User {
    @Column(name="Id")
    @Id
    private int id;
    @Column(name="Login")
    private String login;
    @Column(name="Password")
    private String password;
    @Column(name="Email")
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(){
        this.login="";
        this.password="";
    }

}
