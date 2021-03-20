package me.olivejua.pracspringcore;

import me.olivejua.pracspringcore.domain.Driver;
import me.olivejua.pracspringcore.service.DriverService;
import me.olivejua.pracspringcore.service.DriverServiceImpl;
import me.olivejua.pracspringcore.service.DrivingLevel;

public class DriverApp {
    public static void main(String[] args) {
        DriverService driverService = new DriverServiceImpl();
        Driver driver = new Driver(1L, "Driver1", DrivingLevel.BEGINNING);
        driverService.join(driver);

        Driver findDriver = driverService.findDriver(driver.getId());
        System.out.println("driver = " + driver.getName());
        System.out.println("findDriver = " + findDriver.getName());
    }
}
