package ExamPreparation.easterRaces.entities.racers;

import ExamPreparation.easterRaces.entities.drivers.Driver;

import java.util.ArrayList;
import java.util.Collection;

import static ExamPreparation.easterRaces.common.ExceptionMessages.*;

public class RaceImpl implements Race{
    private String name;
    private int laps;
    private Collection<Driver> drivers;

    public RaceImpl(String name, int laps) {
        this.setName(name);
        this.setLaps(laps);
        this.drivers = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name.length() < 5 ||
                name.trim().isEmpty()) {
            throw new IllegalArgumentException(String.format(INVALID_MODEL, name, 5));
        }
        this.name = name;
    }

    public void setLaps(int laps) {
        if(laps < 1){
            throw new IllegalArgumentException(String.format(INVALID_NUMBER_OF_LAPS, 1));
        }
        this.laps = laps;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getLaps() {
        return this.laps;
    }

    @Override
    public Collection<Driver> getDrivers() {
        return this.drivers;
    }

    @Override
    public void addDriver(Driver driver) {
        if(driver == null){
            throw new IllegalArgumentException(DRIVER_INVALID);
        }

        if(!driver.getCanParticipate()){
            throw new IllegalArgumentException(String.format(DRIVER_NOT_PARTICIPATE, driver.getName()));
        }

        if(drivers.contains(driver)){
            throw new IllegalArgumentException(String.format(DRIVER_ALREADY_ADDED, driver.getName() ,this.name));
        }

        drivers.add(driver);
    }
}
