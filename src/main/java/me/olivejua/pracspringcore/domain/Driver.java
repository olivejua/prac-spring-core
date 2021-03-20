package me.olivejua.pracspringcore.domain;

import me.olivejua.pracspringcore.service.DrivingLevel;

public class Driver {

    private Long id;
    private String name;
    private DrivingLevel level;

    public Driver(Long id, String name, DrivingLevel level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DrivingLevel getLevel() {
        return level;
    }

    public void setLevel(DrivingLevel level) {
        this.level = level;
    }
}
