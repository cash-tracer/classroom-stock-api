package com.tally.api.classroom.model.response;

public class ClassRoomOutputDto {

    public static class RegisterClassRoomResponse {

        private final Long classroomId;

        public RegisterClassRoomResponse(final Long classroomId) {
            this.classroomId = classroomId;
        }

        public Long getClassroomId() {
            return classroomId;
        }
    }
}
