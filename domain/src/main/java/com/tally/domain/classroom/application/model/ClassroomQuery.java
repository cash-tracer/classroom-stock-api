package com.tally.domain.classroom.application.model;

import com.tally.domain.classroom.domain.entity.Classroom;

import java.time.LocalDateTime;

public class ClassroomQuery {

    public static class RegisterClassroom {

        private final Long id;
        private final Long teacherId;
        private final String classroomName;
        private final String classroomCode;
        private final String schoolCode;
        private final LocalDateTime createdAt;

        public RegisterClassroom(final Long classroomId, final Long teacherId, final String classroomName, final String classroomCode, final String schoolCode, final LocalDateTime createdAt) {
            this.id = classroomId;
            this.teacherId = teacherId;
            this.classroomName = classroomName;
            this.classroomCode = classroomCode;
            this.schoolCode = schoolCode;
            this.createdAt = createdAt;
        }

        public static RegisterClassroom toQuery(final Classroom classroom) {
            return new RegisterClassroom(
                    classroom.getId(),
                    classroom.getTeacherId(),
                    classroom.getName(),
                    classroom.getCode(),
                    classroom.getSchoolCode(),
                    classroom.getCreatedAt()
            );
        }

        public Long getId() {
            return id;
        }

    }
}
