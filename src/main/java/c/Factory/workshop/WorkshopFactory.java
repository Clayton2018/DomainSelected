package c.Factory.workshop;

import c.domain.workshop.Workshop;
import c.util.IdGenerator;

public class WorkshopFactory {

    public static Workshop getWorkshop(String workshopName,String locID, int noEmployees, String equipmentID, String areaN){

        return (Workshop) new Workshop.WorkshopBuilder()
                .locationID(locID)
                .noOfEmployees(noEmployees)
                .workshopName(workshopName)
                .equipmentID(equipmentID)
                .areaID(IdGenerator.generateId())
                .areaName(areaN)
                .build();

    }

}
