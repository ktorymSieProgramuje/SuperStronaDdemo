package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;
    private String surname;
    private String login;
    private String dateOfBirth;

    public User(){}

    public User(String name, String surname, String login, String dateOfBirth){

        this.name = name;
        this.surname = surname;
        this.login = login;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getId() {
        return id;
    }
}
