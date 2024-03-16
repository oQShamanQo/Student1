package com.example.Student.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate date;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;
}
