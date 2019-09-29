package c.Factory.vehicle;

import c.domain.vehicle.Suv;

public class SuvFactory {

    public static Suv getSuv(String bStyle, String manufacturer, String regNum, String lastSD, int mY, int vN, int eC, double mileage){

        return (Suv) new Suv.SuvBuilder()
                .bodyStyle(bStyle)
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


