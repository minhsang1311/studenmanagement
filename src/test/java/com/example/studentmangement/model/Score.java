package com.example.studentmangement.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int score1;
    private int score2;
    private double grade;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @PrePersist
    @PreUpdate
    public void calculateGrade() {
        double totalScore = 0.3 * score1 + 0.7 * score2;
        if (totalScore >= 8.0) {
            this.grade = 'A';
        } else if (totalScore >= 6.0) {
            this.grade = 'B';
        } else if (totalScore >= 4.0) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }
}
