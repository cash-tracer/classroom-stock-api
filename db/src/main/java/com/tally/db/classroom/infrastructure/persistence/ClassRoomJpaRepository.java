package com.tally.db.classroom.infrastructure.persistence;

import com.tally.domain.classroom.domain.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRoomJpaRepository extends JpaRepository<ClassRoom, Long> {

}
