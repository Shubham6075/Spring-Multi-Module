package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String classification;
    private String isOpen;

    public Hotel() {
    }

    public Hotel(String name, String classification, String isOpen){
        this.name = name;
        this.classification = classification;
        this.isOpen = isOpen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String isOpen() {
        return isOpen;
    }

    public void setOpen(String open) {
        isOpen = open;
    }
}
