package DesignPatterns.Facade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] carData = scan.nextLine().split("\\s+");

        Car car = new CarBuilderFacade().
                info().
                Type(carData[0]).
                Color(carData[1]).
                NumberOfDoors(Integer.parseInt(carData[2])).
                built().
                City(carData[3]).
                Address(carData[4]).
                build();

        System.out.println(car);
    }
}
