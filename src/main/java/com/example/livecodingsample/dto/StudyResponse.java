package com.example.livecodingsample.dto;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
public class StudyResponse {
    private Long id;
    private String name;
    private String skillStack;
    private String leader;
}
