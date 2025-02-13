package com.Gym.Gymrate.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private int trainingLevel;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<WorkoutSession> workoutSessionList; // No inicializar aquí para que JPA maneje la relación correctamente y evite problemas con Lazy Loading



    public User () {

    }

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

    public List<WorkoutSession> getWorkoutSessionList() {
        return workoutSessionList;
    }

    public void setWorkoutSessionList(List<WorkoutSession> workoutSessionList) {
        this.workoutSessionList = workoutSessionList;
    }
}
