package com.max.gamesearch.mapper;

import com.max.gamesearch.dto.RecordInsertDTO;
import com.max.gamesearch.entities.Record;
import com.max.gamesearch.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class RecordMapper {

    @Autowired
    private GameRepository gameRepository;

    public Record toEntity(RecordInsertDTO dto) {
        Record entity = new Record();
        entity.setName(dto.getName());
        entity.setMoment(Instant.now());
        entity.setAge(dto.getAge());
        entity.setGame(gameRepository.getOne(dto.getGameId()));
        return entity;
    }
}
