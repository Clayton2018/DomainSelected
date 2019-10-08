package c.Factory.vehicle;

import c.domain.vehicle.Car;

public class CarFactory {

    public static Car getCar(String regNum, String bStyle, String manufacturer, String lastSD, int mY, int vN, int eC, double mileage){

        return (Car) new Car.CarBuilder()
                .bodyStyle(bStyle)
                .manufacturer(manufacturer)
                .regNum(regNum)
                .lastServiceDate(lastSD)
                .modelYear(mY)
                .vinNum(vN)
                .engineCapacity(eC)
                .mileage(mileage)
                .build();

    }

}
