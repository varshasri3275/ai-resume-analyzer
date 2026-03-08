package com.example.ai_resume_analyzer.model;

import jakarta.persistence.*;

@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(length = 10000)
    private String content;

    private String analysis;

    // getters setters
}