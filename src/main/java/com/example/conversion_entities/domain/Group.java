package com.example.conversion_entities.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "groups")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Group  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long id;

    @Column(name = "group_name")
    private String Name;

    @OneToMany(mappedBy = "group")
    @JsonIgnore
    private List<Student> students;

}
