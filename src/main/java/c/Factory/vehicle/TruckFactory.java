package c.Factory.vehicle;

import c.domain.vehicle.Truck;

public class TruckFactory {

    public static Truck getTruck(String type,String lC, String manufacturer, String regNum, String lastSD, int mY, int vN, int eC, double mileage){

        return (Truck) new Truck.TruckBuilder()
                .type(type)
                .loadCapacity(lC)
                .manufacturer(manufacturer)
                .registrationNumber(regNum)
                .lastServiceDate(lastSD)
                .modelYear(mY)
                .vinNum(vN)
                .engineCapacity(eC)
                .mileage(mileage)
                .build();



    }

}
