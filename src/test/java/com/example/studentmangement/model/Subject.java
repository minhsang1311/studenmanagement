package com.example.studentmangement.model;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int credit;

    @OneToMany(mappedBy = "subject")
    private List<Score> scores;

    // getters and setters
}
