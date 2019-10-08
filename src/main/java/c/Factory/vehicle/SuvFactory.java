package c.Factory.vehicle;

import c.domain.vehicle.Suv;

public class SuvFactory {

    public static Suv getSuv(String regNum, String bStyle, String manufacturer, String lastSD, int mY, int vN, int eC, double mileage){

        return (Suv) new Suv.SuvBuilder()
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


