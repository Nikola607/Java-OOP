package DesignPatterns.Facade;

public class CarInfoBuilder extends CarBuilderFacade {

    public CarInfoBuilder(Car car) {
        this.car = car;
    }

    public CarInfoBuilder Type(String type){
        car.setType(type);
        return this;
    }

    public CarInfoBuilder Color(String color){
        car.setColor(color);
        return this;
    }

    public CarInfoBuilder NumberOfDoors(int doors){
        car.setNumberOfDoors(doors);
        return this;
    }
}
