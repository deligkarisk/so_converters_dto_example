package com.example.conversion_entities.converters;

import com.example.conversion_entities.domain.Student;
import com.example.conversion_entities.dto.StudentDto;
import org.springframework.stereotype.Component;

@Component
public class StudentToStudentDtoConvervter implements org.springframework.core.convert.converter.Converter<Student,
        StudentDto> {

    @Override
    public StudentDto convert(Student student) {

        StudentDto studentDto = new StudentDto(student.getFirstName(), student.getLastName(),
                student.getEmail(), student.getId(), student.getStudentAge(),
                student.getStudentLevel(), student.getCreationDate());

        return studentDto;

    }
}