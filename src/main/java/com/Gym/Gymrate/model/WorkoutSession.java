package com.Gym.Gymrate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class WorkoutSession {
    @Id
    private String id;
    private String trainingType;
    private String dateAndHour;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID_FK")
    private User user;

    public WorkoutSession() {

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTrainingType() {
        return trainingType;
    }
    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public String getDateAndHour() {
        return dateAndHour;
    }
    public void setDateAndHour(String dateAndHour) {
        this.dateAndHour = dateAndHour;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
