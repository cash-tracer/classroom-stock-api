package com.tally.domain.classroom.domain.entity;

import com.tally.domain.classroom.application.model.ClassroomCommand;
import com.tally.domain.common.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Getter
@Entity
@Table(name = "classrooms")
public class Classroom extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classroom_id", nullable = false)
    private Long id;

    @Column(name = "teacher_id", nullable = false)
    private Long teacherId;

    @Column(name = "classroom_name", nullable = false)
    private String name;

    @Column(name = "classroom_code", nullable = false, unique = true)
    private String code;

    @Column(name = "school_code", nullable = false)
    private String schoolCode;

    protected Classroom() {}

    @Builder
    public Classroom(final Long teacherId, final String name, final String code, final String schoolCode) {
        this.teacherId = teacherId;
        this.name = name;
        this.code = code;
        this.schoolCode = schoolCode;
    }

    public static Classroom registered(final ClassroomCommand.RegisterClassroom command) {
        return new Classroom(command.getTeacherId(), command.getClassroomName(), command.getClassroomCode(), command.getSchoolCode());
    }
}
