package com.max.gamesearch.repositories;

import com.max.gamesearch.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
