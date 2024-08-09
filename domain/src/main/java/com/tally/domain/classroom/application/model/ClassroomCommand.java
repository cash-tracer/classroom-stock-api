package com.tally.domain.classroom.application.model;

import lombok.Getter;

public class ClassroomCommand {

    @Getter
    public static class RegisterClassroom {

        private final Long teacherId;
        private final String classroomName;
        private final String classroomCode;
        private final String schoolCode;

        public RegisterClassroom(final Long teacherId, final String classroomName, final String classroomCode, final String schoolCode) {
            this.teacherId = teacherId;
            this.classroomName = classroomName;
            this.classroomCode = classroomCode;
            this.schoolCode = schoolCode;
        }

    }
}
