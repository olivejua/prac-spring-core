package me.olivejua.pracspringcore.service;

import me.olivejua.pracspringcore.domain.Driver;

public interface DriverService {

    void join(Driver driver);

    Driver findDriver(Long driverId);
}
