package com.example.conversion_entities;

import com.example.conversion_entities.domain.Group;
import com.example.conversion_entities.domain.Student;
import com.example.conversion_entities.dto.GroupDto;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.convert.ConversionService;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class GroupToGroupDtoConverterTest {


    @Autowired
    ConversionService conversionService;


    @Test
    void convert() {
        Student studentA = new Student();
        studentA.setFirstName("John");
        studentA.setLastName("Doe");

        Student studentB = new Student();
        studentB.setFirstName("Jane");
        studentB.setLastName("Doe");

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentA);
        studentList.add(studentB);

        Group group = new Group(1L, "groupA", studentList);

        GroupDto convertedGroupDto = conversionService.convert(group, GroupDto.class);
        assertEquals("John", convertedGroupDto.getStudents().get(0).getFirstName());
        assertEquals("Jane", convertedGroupDto.getStudents().get(1).getFirstName());
    }
}
