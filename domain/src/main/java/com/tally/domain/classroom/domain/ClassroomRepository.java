package com.tally.domain.classroom.domain;

import com.tally.domain.classroom.domain.entity.Classroom;

import java.util.List;

public interface ClassroomRepository {

    List<Classroom> getAll();

    Classroom save(final Classroom classroom);

}
