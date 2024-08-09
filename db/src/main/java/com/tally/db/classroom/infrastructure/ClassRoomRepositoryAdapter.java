package com.tally.db.classroom.infrastructure;

import com.tally.db.classroom.infrastructure.persistence.ClassRoomJpaRepository;
import com.tally.domain.classroom.domain.entity.ClassRoom;
import com.tally.domain.classroom.infrastructure.persistence.ClassRoomRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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
