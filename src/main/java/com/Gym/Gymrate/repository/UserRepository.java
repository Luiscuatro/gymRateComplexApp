package com.Gym.Gymrate.repository;

import com.Gym.Gymrate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
