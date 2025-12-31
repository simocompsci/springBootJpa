package com.example.practice.entities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "USERS")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID" , nullable=false)
    private int id;

    @Column(name = "NAME" , nullable = false , length = 100)
    private String name;

    private String email;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    public User(){

    }

    
}
