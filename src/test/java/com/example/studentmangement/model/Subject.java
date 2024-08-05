package com.example.studentmangement.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int credit;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private List<Score> scores;
}
