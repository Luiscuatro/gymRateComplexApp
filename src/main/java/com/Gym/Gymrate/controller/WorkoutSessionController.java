package com.Gym.Gymrate.controller;


import com.Gym.Gymrate.model.WorkoutSession;
import com.Gym.Gymrate.service.WorkoutSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workout-sessions")
public class WorkoutSessionController {

    @Autowired
    private WorkoutSessionService workoutSessionService;

    @GetMapping
    public List<WorkoutSession> getAllSessions() {
        return workoutSessionService.getAllSessions();
    }

    @GetMapping("/{id}")
    public WorkoutSession getSessionById(@PathVariable String id) {
        return workoutSessionService.getSessionById(id).orElse(null);
    }

    @PostMapping("/createSession")
    public WorkoutSession createSession(@RequestBody WorkoutSession session) {
        return workoutSessionService.createSession(session);
    }

    @PutMapping("/{id}")
    public WorkoutSession updateSession(@PathVariable String id, @RequestBody WorkoutSession session) {
        session.setId(id);
        return workoutSessionService.updateSession(session);
    }

    @DeleteMapping("/{id}")
    public String deleteSession(@PathVariable String id){
        if(workoutSessionService.existsById(id)) {
            workoutSessionService.deleteSession(id);
            return "Session deleted";
        }

        return "session not found";
    }

    @DeleteMapping()
    public String deleteAllSessions() {
        workoutSessionService.deleteAllSessions();
        return "All workout sessions deleted";

    }
}