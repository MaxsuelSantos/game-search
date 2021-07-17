package com.max.gamesearch.controllers;

import com.max.gamesearch.dto.RecordDTO;
import com.max.gamesearch.dto.RecordInsertDTO;
import com.max.gamesearch.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService service;


    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto) {
        RecordDTO recordDTO = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(recordDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(recordDTO);
    }
}
