package com.Gym.Gymrate.service;

import com.Gym.Gymrate.model.WorkoutSession;
import com.Gym.Gymrate.repository.WorkoutSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutSessionService {

    @Autowired
    private WorkoutSessionRepository workoutSessionRepository;

    public List<WorkoutSession> getAllSessions() {
        return workoutSessionRepository.findAll();
    }

    public Optional<WorkoutSession> getSessionById(String id) {
        return workoutSessionRepository.findById(id);
    }

    public WorkoutSession createSession(WorkoutSession session) {
        return workoutSessionRepository.save(session);
    }

    public WorkoutSession updateSession(WorkoutSession session) {
        return workoutSessionRepository.save(session);
    }

    public void deleteSession(String id) {
        workoutSessionRepository.deleteById(id);
    }

    public void deleteAllSessions() {
        workoutSessionRepository.deleteAll();
    }

    public boolean existsById(String id) {
        return workoutSessionRepository.existsById(id);
    }

    public int getSessionCount() {
        return (int) workoutSessionRepository.count();
    }
}
