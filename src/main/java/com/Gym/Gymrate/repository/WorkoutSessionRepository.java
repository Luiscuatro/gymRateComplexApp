package com.Gym.Gymrate.repository;

import com.Gym.Gymrate.model.WorkoutSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutSessionRepository extends JpaRepository<WorkoutSession, String> {
}
