package com.example.livecodingsample.controller;

import com.example.livecodingsample.dto.StudyRequest;
import com.example.livecodingsample.dto.StudyResponse;
import com.example.livecodingsample.service.StudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudyController {

    private final StudyService studyService;

    //생성
    @PostMapping("api/study")
    public ResponseEntity<Void> create(@RequestBody StudyRequest dto) {
        studyService.create(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    //목록 조회
    @GetMapping("api/study")
    public ResponseEntity<List<StudyResponse>> getAll() {
        return ResponseEntity.ok(studyService.getAll());
    }

    //단일 조회
    @GetMapping("api/study/{id}")
    public ResponseEntity<StudyResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(studyService.getById(id));
    }
}
