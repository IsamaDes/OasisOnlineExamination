package com.example.onlineexamination.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "users",
        uniqueConstraints =
        @UniqueConstraint(columnNames = "email")
)

public class Users {
    @Id
    @SequenceGenerator(name="user-seq", initialValue = 2000)
    @JsonIgnore
    Long id;


    private String firstName;
    private String lastname;
    private String courseId;
    private String subject;
    private String email;
    private String password;
    private String confirmPassword;
    private Role userRole;
    private Boolean isEnabled;

}
