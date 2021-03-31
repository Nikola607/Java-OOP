package DesignPatterns.Facade;

public class CarAddressBuilder extends CarBuilderFacade{
    public CarAddressBuilder(Car car) {
        this.car = car;
    }

    public CarAddressBuilder Address(String address){
        car.setAddress(address);
        return this;
    }

    public CarAddressBuilder City(String city){
        car.setCity(city);
        return this;
    }
}
