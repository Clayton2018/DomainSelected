package c.Factory.workshop;

import c.domain.workshop.Location;

public class LocationFactory {

    public static Location getLocation(int aCode, String aName){

        return new Location.Builder()
                .areaCode(aCode)
                .areaName(aName)
                .build();
        

    }

}
