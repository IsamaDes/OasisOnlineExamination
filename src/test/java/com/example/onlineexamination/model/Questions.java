package com.example.onlineexamination.model;

import jakarta.persistence.JoinColumn;

public class Questions {
    private String subject;
    @JoinColumn(name = "answerId")
    private String answer;
    private String isPublished;
    private String draft;
    private int timeLimit;
    private String description;


}
