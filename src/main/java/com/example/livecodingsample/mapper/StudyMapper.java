package com.example.livecodingsample.mapper;

import com.example.livecodingsample.dto.StudyRequest;
import com.example.livecodingsample.dto.StudyResponse;
import com.example.livecodingsample.entity.Study;
import org.springframework.stereotype.Component;

@Component
public class StudyMapper {

    public Study mapToEntity(StudyRequest dto) {
        return Study.builder()
                .name(dto.getName())
                .leader(dto.getLeader())
                .skillStack(dto.getSkillStack())
                .password(dto.getPassword())
                .build();
    }

    public StudyResponse mapToDTO(Study entity) {
        return StudyResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .leader(entity.getLeader())
                .skillStack(entity.getSkillStack())
                .build();
    }

}
