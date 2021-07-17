package com.max.gamesearch.dto;

import java.time.Instant;

public class RecordInsertDTO {

    private String name;
    private Integer age;
    private Long gameId;

    public RecordInsertDTO() {
    }

    public RecordInsertDTO(String name, Integer age, Instant moment, Long gameId) {
        this.name = name;
        this.age = age;
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }
}
