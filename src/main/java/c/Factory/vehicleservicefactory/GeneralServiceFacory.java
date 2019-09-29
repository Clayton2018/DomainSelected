package c.Factory.vehicleservicefactory;

import c.domain.customer.Customer;
import c.domain.vehicle.Vehicle;
import c.domain.vehicleservice.GeneralService;

public class GeneralServiceFacory {

    public static GeneralService getGeneralService(int sID, String sDate, String sDesc, String type){

        return (GeneralService) new GeneralService.GeneralServiceBuilder()
                .generalServiceType(type)
                .serviceID(sID)
                .serviceDate(sDate)
                .serviceDescription(sDesc)
                .build();

    }

}
