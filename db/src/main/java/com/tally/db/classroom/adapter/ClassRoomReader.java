package com.tally.db.classroom.adapter;

import com.tally.db.classroom.repository.ClassRoomJpaRepository;
import com.tally.domain.classroom.entity.ClassRoom;
import com.tally.domain.classroom.persistence.ClassRoomRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassRoomReader implements ClassRoomRepository {

    private final ClassRoomJpaRepository classRoomJpaRepository;

    public ClassRoomReader(final ClassRoomJpaRepository classRoomJpaRepository) {
        this.classRoomJpaRepository = classRoomJpaRepository;
    }

    @Override
    public List<ClassRoom> getAll() {
        return classRoomJpaRepository.findAll();
    }

}
