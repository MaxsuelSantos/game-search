package com.max.gamesearch.repositories;

import com.max.gamesearch.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
