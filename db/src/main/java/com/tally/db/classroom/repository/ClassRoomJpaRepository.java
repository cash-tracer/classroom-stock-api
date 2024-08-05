package com.tally.db.classroom.repository;

import com.tally.domain.classroom.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRoomJpaRepository extends JpaRepository<ClassRoom, Long> {

}
