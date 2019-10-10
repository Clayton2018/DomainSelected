package c.Factory.vehicleservice;

import c.domain.vehicleservice.AccidentDamageRepair;
import c.util.IdGenerator;

public class AccidentDamageRepairFactory {

    public static AccidentDamageRepair getAccidentDamageRepair(String accCode, String accDesc, double eCTR, String eRT){

        return new AccidentDamageRepair.AccidentDamageRepairBuilder()
                .accidentID(IdGenerator.generateId())
                .accidentCode(accCode)
                .accidentDescription(accDesc)
                .estimatedCostToRepair(eCTR)
                .estimatedRepairTime(eRT)
                .build();

    }

}//end AccidentDamageRepairFactory class
