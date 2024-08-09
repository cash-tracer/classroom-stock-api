package com.tally.domain.classroom.service;

import com.tally.domain.classroom.domain.entity.ClassRoom;
import com.tally.domain.classroom.infrastructure.persistence.ClassRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {

    private final ClassRoomRepository classRoomRepository;

    public ClassRoomService(final ClassRoomRepository classRoomRepository) {
        this.classRoomRepository = classRoomRepository;
    }

    public List<ClassRoom> getAll() {
        return classRoomRepository.readClassRooms();
    }
}
