package c.Factory.vehicleservice;

import c.domain.vehicleservice.VehicleService;

public class VehicleServiceFactory {

    public static VehicleService getVehicleService(int sID, String sDate, String sDesc){

        return new VehicleService.VehicleServiceBuilder()
                .serviceID(sID)
                .serviceDate(sDate)
                .serviceDescription(sDesc)
                .build();

    }

}
