package com.example.onlineexamination.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Answer {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String questionNum;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private Users userId;

}
