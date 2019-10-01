package c.Factory.workshop;

import c.domain.workshop.Equipment;

public class EquipmentFactory {

    public static Equipment getEquipment(int eNum, String eName){

        return new Equipment.EquipmentBuilder()
                .equipNum(eNum)
                .equipName(eName)
                .build();

    }

}
