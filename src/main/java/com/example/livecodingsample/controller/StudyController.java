package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyController {



    //생성
    @PostMapping("api/study")
    public ResponseEntity<> getAll() {

    }

    //하나 조회
    @GetMapping("api/study/{id}")
    public ResponseEntity<> getAll() {

    }

    //목록 조회
    @GetMapping("api/study")
    public ResponseEntity<> getAll() {

    }
}
