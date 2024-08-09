package com.tally.api.classroom.model.request;

import com.tally.domain.classroom.application.model.ClassroomCommand;

public class ClassRoomInputDtoMapper {

    private ClassRoomInputDtoMapper() {}

    public static ClassroomCommand.RegisterClassroom toCommand(
            final ClassRoomInputDto.RegisterClassRoomRequest registerClassRoomRequest
    ) {
        return new ClassroomCommand.RegisterClassroom(
                registerClassRoomRequest.getTeacherId(),
                registerClassRoomRequest.getClassroomName(),
                registerClassRoomRequest.getClassroomCode(),
                registerClassRoomRequest.getSchoolCode());
    }
}
