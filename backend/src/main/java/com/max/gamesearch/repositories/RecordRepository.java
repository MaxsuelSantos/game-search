package com.max.gamesearch.repositories;

import com.max.gamesearch.entities.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Instant;

public interface RecordRepository extends JpaRepository<Record, Long> {

    @Query("SELECT obj FROM Record obj WHERE " +
            "(coalesce(:min, null) IS NULL OR obj.moment >= :min) AND " +
            "(coalesce(:max, null) IS NULL OR obj.moment <= :max)")
    Page<Record> findByMoments(Instant min, Instant max, Pageable pageable);
}
