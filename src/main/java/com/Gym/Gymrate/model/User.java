package com.Gym.Gymrate.model;

import jakarta.persistence.*;


@Entity
@Table(name = "APP_USERS")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private int trainingLevel;

    public User () {}

    public User (String id, String name, String email, int trainingLevel) {
        this.id = id;
        this.name = name;
        this.email= email;
        this.trainingLevel = trainingLevel;
    }

    public String getId () {
        return id;
    }
    public void setId (String id){
        this.id = id;
    }

    public String getName () {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public String getEmail () {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public int getTrainingLevel() {
        return trainingLevel;
    }
    public void setTrainingLevel(int trainingLevel) {
        this.trainingLevel = trainingLevel;
    }
}
