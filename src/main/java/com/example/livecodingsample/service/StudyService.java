package com.example.livecodingsample.service;

import com.example.livecodingsample.dto.StudyRequest;
import com.example.livecodingsample.dto.StudyResponse;
import com.example.livecodingsample.entity.Study;
import com.example.livecodingsample.entity.StudyRepository;
import com.example.livecodingsample.mapper.StudyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudyService {

    private final StudyRepository studyRepository;
    private final StudyMapper studyMapper;


    // 생성 기능
    public void create(StudyRequest request) {
        Study study = studyMapper.mapToEntity(request);
        studyRepository.save(study);
    }

    // 단일 조회 기능
    public StudyResponse getById(Long id) {
        Study result = studyRepository.findById(id)
                .orElseThrow(EntityExistsException::new);

        return studyMapper.mapToDTO(result);
    }

    // 목록 조회 기능

    public List<StudyResponse> getAll() {
        return studyRepository.findAll()
                .stream()
                .map(studyMapper::mapToDTO)
                .collect(Collectors.toList());
    }

}
