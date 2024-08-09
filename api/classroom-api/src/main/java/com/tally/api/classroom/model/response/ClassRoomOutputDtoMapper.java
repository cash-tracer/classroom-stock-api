package com.tally.api.classroom.model.response;

import com.tally.domain.classroom.application.model.ClassroomQuery;

public class ClassRoomOutputDtoMapper {

    private ClassRoomOutputDtoMapper() {}

    public static ClassRoomOutputDto.RegisterClassRoomResponse toResponse(final ClassroomQuery.RegisterClassroom registerClassroom) {
        return new ClassRoomOutputDto.RegisterClassRoomResponse(registerClassroom.getId());
    }
}
