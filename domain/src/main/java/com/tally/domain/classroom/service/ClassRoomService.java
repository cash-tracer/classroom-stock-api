package com.tally.domain.classroom.service;

import com.tally.domain.classroom.entity.ClassRoom;
import com.tally.domain.classroom.persistence.ClassRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {

    private final ClassRoomRepository classRoomRepository;

    public ClassRoomService(final ClassRoomRepository classRoomRepository) {
        this.classRoomRepository = classRoomRepository;
    }

    public List<ClassRoom> getAll() {
        return classRoomRepository.getAll();
    }
}
