package com.polytech.rendu;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "fruit")
public class Fruit implements Serializable {
    @Id
    private String id;

    @Field("designation")
    private String designation;

    @Field("prix")
    private double prix;

    public Fruit(String id, String designation, double prix) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
    }

    public Fruit() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}