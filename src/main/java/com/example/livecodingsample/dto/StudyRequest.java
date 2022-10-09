package com.example.livecodingsample.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudyRequest {
    private String name;
    private String skillStack;
    private String leader;
    private String password;
}
