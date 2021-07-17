package com.max.gamesearch.mapper;

import com.max.gamesearch.dto.GameDTO;
import com.max.gamesearch.entities.Game;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GameMapper {

    public GameDTO toDTO(Game entity) {
        GameDTO dto = new GameDTO();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setPlatform(entity.getPlatform());
        return dto;
    }

    public List<GameDTO> toDTO(List<Game> list) {
        return list.stream().map(this::toDTO).collect(Collectors.toList());
    }

}
