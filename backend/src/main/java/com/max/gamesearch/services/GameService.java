package com.max.gamesearch.services;

import com.max.gamesearch.dto.GameDTO;
import com.max.gamesearch.mapper.GameMapper;
import com.max.gamesearch.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Autowired
    private GameMapper mapper;

    @Transactional(readOnly = true)
    public List<GameDTO> findAll() {
        return mapper.toDTO(repository.findAll());
    }
}
