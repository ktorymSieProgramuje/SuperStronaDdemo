package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rola {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idRoli;

    private String userRole;

    public Rola(){}

    public Rola(String userRole){
        this.userRole = userRole;
    }

    public String getUserRole() {
        return userRole;
    }

    public long getIdRoli() {
        return idRoli;
    }
}
