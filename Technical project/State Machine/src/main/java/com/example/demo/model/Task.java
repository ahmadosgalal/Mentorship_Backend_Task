package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.UUID;

public class Task {
    private final UUID id;
    private final String title;
    private String state;

    public Task(@JsonProperty("id") UUID id,
                @JsonProperty("name") String title,
                @JsonProperty("state") String state) {
        this.id = id;
        this.title = title;
        this.state = state;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getState() {
        return state;
    }


}
