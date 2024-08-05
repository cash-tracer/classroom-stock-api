package com.tally.domain.classroom.persistence;

import com.tally.domain.classroom.entity.ClassRoom;

import java.util.List;

public interface ClassRoomRepository {

    List<ClassRoom> getAll();
}
