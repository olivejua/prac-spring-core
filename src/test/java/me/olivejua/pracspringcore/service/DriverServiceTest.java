package me.olivejua.pracspringcore.service;

import me.olivejua.pracspringcore.domain.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverServiceTest {

    DriverService driverService = new DriverServiceImpl();

    @Test
    void join() {
        Long driverId = 1L;

        Driver driver1 = new Driver(driverId, "driver1", DrivingLevel.BEGINNING);
        driverService.join(driver1);
        driverService.findDriver(driver1.getId());

        assertEquals(driverId, driver1.getId());
    }

}