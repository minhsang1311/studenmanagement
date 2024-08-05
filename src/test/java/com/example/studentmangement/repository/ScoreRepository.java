package com.example.studentmangement.repository;
import com.example.studentmangement.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
