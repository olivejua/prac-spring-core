package me.olivejua.pracspringcore.domain;

import java.util.HashMap;
import java.util.Map;

public class MemoryDriverRepository implements DriverRepository {

    private static Map<Long, Driver> store = new HashMap<>();

    @Override
    public void save(Driver driver) {
        store.put(driver.getId(), driver);
    }

    @Override
    public Driver findById(Long driverId) {
        return store.get(driverId);
    }
}
