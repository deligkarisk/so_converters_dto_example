package com.example.conversion_entities.dto;

import java.io.Serializable;
import java.util.Date;

public class StudentDto implements Serializable {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Integer studentAge;
    private final Integer studentLevel;
    private final Date creationDate;

    public StudentDto(String firstName, String lastName, String email, Long id, Integer studentAge, Integer studentLevel,
                      Date creationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.studentAge = studentAge;
        this.studentLevel = studentLevel;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getFirstName() {
        return firstName;
    }
}