package com.tally.domain.classroom.infrastructure.persistence;

import com.tally.domain.classroom.domain.entity.ClassRoom;

import java.util.List;

public interface ClassRoomRepository {

    List<ClassRoom> readClassRooms();
}
