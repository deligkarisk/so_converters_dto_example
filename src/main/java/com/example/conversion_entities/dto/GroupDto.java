package com.example.conversion_entities.dto;

import com.example.conversion_entities.dto.StudentDto;

import java.util.List;

public class GroupDto {

    private final Long id;
    private final String name;
    private List<StudentDto> students;

    public GroupDto(Long id, String name, List<StudentDto> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public Long getId() {
        return id;
    }
    public List<StudentDto> getStudents() {
        return students;
    }
}