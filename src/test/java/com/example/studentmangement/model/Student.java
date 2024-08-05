package com.example.studentmangement.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Score> scores;
}
