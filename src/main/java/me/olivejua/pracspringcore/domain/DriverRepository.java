package me.olivejua.pracspringcore.domain;

public interface DriverRepository {

    void save(Driver driver);

    Driver findById(Long driverId);
}
