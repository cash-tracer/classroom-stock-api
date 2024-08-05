package com.tally.db.classroom.adapter;

import com.tally.db.classroom.repository.ClassRoomJpaRepository;
import com.tally.domain.classroom.entity.ClassRoom;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassRoomReader {

    private final ClassRoomJpaRepository classRoomJpaRepository;

    public ClassRoomReader(final ClassRoomJpaRepository classRoomJpaRepository) {
        this.classRoomJpaRepository = classRoomJpaRepository;
    }

    public List<ClassRoom> getAll() {
        return classRoomJpaRepository.findAll();
    }


}
