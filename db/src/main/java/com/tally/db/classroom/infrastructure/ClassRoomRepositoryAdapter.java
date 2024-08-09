package com.tally.db.classroom.infrastructure;

import com.tally.db.classroom.infrastructure.persistence.ClassRoomJpaRepository;
import com.tally.domain.classroom.domain.entity.ClassRoom;
import com.tally.domain.classroom.domain.ClassRoomRepository;
import com.tally.domain.common.annotation.Adapter;

import java.util.List;

@Adapter
public class ClassRoomRepositoryAdapter implements ClassRoomRepository {

    private final ClassRoomJpaRepository classRoomJpaRepository;

    public ClassRoomRepositoryAdapter(final ClassRoomJpaRepository classRoomJpaRepository) {
        this.classRoomJpaRepository = classRoomJpaRepository;
    }

    @Override
    public List<ClassRoom> readClassRooms() {
        return classRoomJpaRepository.findAll();
    }

}
