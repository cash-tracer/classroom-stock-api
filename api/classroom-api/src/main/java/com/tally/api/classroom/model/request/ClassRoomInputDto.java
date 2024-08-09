package com.tally.api.classroom.model.request;

public class ClassRoomInputDto {

    public static class RegisterClassRoomRequest {

        private Long teacherId;
        private String classroomName;
        private String classroomCode;
        private String schoolCode;

        public RegisterClassRoomRequest() {}

        public Long getTeacherId() {
            return teacherId;
        }

        public String getClassroomName() {
            return classroomName;
        }

        public String getClassroomCode() {
            return classroomCode;
        }

        public String getSchoolCode() {
            return schoolCode;
        }
    }
}
