package com.tally.api.classroom;

import com.tally.api.classroom.model.request.ClassRoomInputDto;
import com.tally.api.classroom.model.request.ClassRoomInputDtoMapper;
import com.tally.api.classroom.model.response.ClassRoomOutputDto;
import com.tally.api.classroom.model.response.ClassRoomOutputDtoMapper;
import com.tally.domain.classroom.application.model.ClassroomQuery;
import com.tally.domain.classroom.domain.entity.Classroom;
import com.tally.domain.classroom.application.ClassroomService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClassRoomController {

    private final ClassroomService classRoomService;

    public ClassRoomController(final ClassroomService classRoomService) {
        this.classRoomService = classRoomService;
    }

    @GetMapping("/v1/classrooms")
    public List<Classroom> readClassRooms() {
        return classRoomService.readAll();
    }

    @PostMapping("/v1/classrooms")
    public ResponseEntity<Long> registerClassRoom(@Valid @RequestBody final ClassRoomInputDto.RegisterClassRoomRequest registerClassRoomRequest) {
        final ClassroomQuery.RegisterClassroom registerClassroom = classRoomService.register(ClassRoomInputDtoMapper.toCommand(registerClassRoomRequest));
        final ClassRoomOutputDto.RegisterClassRoomResponse registerClassRoomResponse = ClassRoomOutputDtoMapper.toResponse(registerClassroom);

        return ResponseEntity.ok(registerClassRoomResponse.getClassroomId());
    }

}
