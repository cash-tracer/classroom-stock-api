package com.tally.db.classroom.infrastructure;

import com.tally.db.classroom.infrastructure.persistence.ClassRoomJpaRepository;
import com.tally.domain.classroom.domain.ClassroomRepository;
import com.tally.domain.classroom.domain.entity.Classroom;
import com.tally.domain.common.annotation.Adapter;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Adapter
public class ClassroomRepositoryAdapter implements ClassroomRepository {

    private final ClassRoomJpaRepository classRoomJpaRepository;

    public ClassroomRepositoryAdapter(final ClassRoomJpaRepository classRoomJpaRepository) {
        this.classRoomJpaRepository = classRoomJpaRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Classroom> getAll() {
        return classRoomJpaRepository.findAll();
    }

    @Transactional
    @Override
    public Classroom save(final Classroom classroom) {
        return classRoomJpaRepository.save(classroom);
    }

}
