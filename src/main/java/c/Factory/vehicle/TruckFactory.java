package c.Factory.vehicle;

import c.domain.vehicle.Truck;

public class TruckFactory {

    public static Truck getTruck(String regNum, String type,String lC, String manufacturer, String lastSD, int mY, int vN, int eC, double mileage){

        return (Truck) new Truck.TruckBuilder()
                .type(type)
                .loadCapacity(lC)
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
