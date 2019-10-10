package c.Factory.vehicleservice;

import c.domain.vehicleservice.VehicleService;
import c.util.IdGenerator;

import java.util.Date;

public class VehicleServiceFactory {

    public static VehicleService getVehicleService(Date sDate, String sDesc){

        return new VehicleService.VehicleServiceBuilder()
                .serviceID(IdGenerator.generateId())
                .serviceDate(sDate)
                .serviceDescription(sDesc)
                .build();

    }

}
