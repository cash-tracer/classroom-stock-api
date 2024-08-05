package com.tally.domain.classroom.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "classrooms")
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classroom_id", nullable = false)
    private Long id;

    @Column(name = "classroom_name", nullable = false, unique = true)
    private String name;

}
