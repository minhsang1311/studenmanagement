package com.example.studentmangement.service;
import com.example.studentmangement.model.Score;
import com.example.studentmangement.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }

    public void addScore(Score score) {
        scoreRepository.save(score);
    }
}
