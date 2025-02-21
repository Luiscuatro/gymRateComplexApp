package com.Gym.Gymrate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class WorkoutSession {
    @Id
    private String id;
    private String trainingType;

    public WorkoutSession() {}

    public WorkoutSession(String trainingType, String id) {
        this.trainingType = trainingType;
        this.id = id;
    }

    public String getId() { return id;}
    public void setId(String id) { this.id = id;}

    public String getTrainingType() {
        return trainingType;
    }
    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

}
