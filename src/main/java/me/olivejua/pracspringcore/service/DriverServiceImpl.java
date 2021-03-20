package me.olivejua.pracspringcore.service;

import me.olivejua.pracspringcore.domain.Driver;
import me.olivejua.pracspringcore.domain.DriverRepository;
import me.olivejua.pracspringcore.domain.MemoryDriverRepository;

public class DriverServiceImpl implements DriverService {
    DriverRepository driverRepository =  new MemoryDriverRepository();

    @Override
    public void join(Driver driver) {
        driverRepository.save(driver);
    }

    @Override
    public Driver findDriver(Long driverId) {
        return driverRepository.findById(driverId);
    }
}
