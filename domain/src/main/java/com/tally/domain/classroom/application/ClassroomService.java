package com.tally.domain.classroom.application;

import com.tally.domain.classroom.application.model.ClassroomCommand;
import com.tally.domain.classroom.domain.ClassroomRepository;
import com.tally.domain.classroom.domain.entity.Classroom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.tally.domain.classroom.application.model.ClassroomQuery.RegisterClassroom;

@Service
@RequiredArgsConstructor
public class ClassroomService {

    private final ClassroomRepository classRoomRepository;
    public List<Classroom> readAll() {
        return classRoomRepository.getAll();
    }
    public RegisterClassroom register(final ClassroomCommand.RegisterClassroom command) {
        final Classroom classroom = classRoomRepository.save(Classroom.registered(command));
        return RegisterClassroom.toQuery(classroom);
    }
}
