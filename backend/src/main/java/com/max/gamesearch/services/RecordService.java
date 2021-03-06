package com.max.gamesearch.services;

import com.max.gamesearch.dto.RecordDTO;
import com.max.gamesearch.dto.RecordInsertDTO;
import com.max.gamesearch.entities.Record;
import com.max.gamesearch.mapper.RecordMapper;
import com.max.gamesearch.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;

    @Autowired
    private RecordMapper mapper;

    @Transactional(readOnly = true)
    public Page<RecordDTO> findByMoments(PageRequest pageRequest, Instant minDate, Instant maxDate) {
        return repository.findByMoments(minDate, maxDate, pageRequest).map(RecordDTO::new);
    }

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto) {
        Record entity = mapper.toEntity(dto);
        return new RecordDTO(repository.save(entity));
    }
}
