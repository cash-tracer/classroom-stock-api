package com.tally.api.classroom;

import com.tally.domain.classroom.domain.entity.ClassRoom;
import com.tally.domain.classroom.service.ClassRoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClassRoomController {

    private final ClassRoomService classRoomService;

    public ClassRoomController(final ClassRoomService classRoomService) {
        this.classRoomService = classRoomService;
    }

    @GetMapping("/v1/classrooms")
    public List<ClassRoom> getAll() {
        return classRoomService.getAll();
    }

}
