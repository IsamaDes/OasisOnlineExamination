package com.example.onlineexamination.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

   public class Subject {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       private List<Questions> questionsList;
       private String subjectImage;

}
