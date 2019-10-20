package c.Factory.workshop;

import c.domain.workshop.Equipment;
import c.util.IdGenerator;

public class EquipmentFactory {

    public static Equipment getEquipment(String eName, String workshopName, String warranty){

        return new Equipment.EquipmentBuilder()
                .equipID(IdGenerator.generateId())
                .equipName(eName)
                .workshopName(workshopName)
                .warranty(warranty)
                .build();

    }

}
