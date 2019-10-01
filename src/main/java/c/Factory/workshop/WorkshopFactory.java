package c.Factory.workshop;

import c.domain.workshop.Workshop;

public class WorkshopFactory {

    public static Workshop getWorkshop(String workshopName, int noEmployees, int locationID, int equipmentID){

        return new Workshop.WorkshopBuilder()
                .locationID(locationID)
                .noOfEmployees(noEmployees)
                .workshopName(workshopName)
                .equipmentID(equipmentID)
                .build();

    }

}
