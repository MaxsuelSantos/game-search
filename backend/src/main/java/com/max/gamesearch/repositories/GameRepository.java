package com.max.gamesearch.repositories;

import com.max.gamesearch.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
