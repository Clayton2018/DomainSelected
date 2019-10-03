package c.Factory.vehicleservice;

import c.domain.vehicleservice.AccidentDamageRepair;

public class AccidentDamageRepairFactory {

    public static AccidentDamageRepair getAccidentDamageRepair(int accCode, String accDesc, double eCTR, String eRT){

        return new AccidentDamageRepair.AccidentDamageRepairBuilder()
                .accidentCode(accCode)
                .accidentDescription(accDesc)
                .estimatedCostToRepair(eCTR)
                .estimatedRepairTime(eRT)
                .build();

    }

}//end AccidentDamageRepairFactory class
