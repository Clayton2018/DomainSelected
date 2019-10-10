package c.Factory.customer;

import c.domain.customer.Insurance;
import c.util.IdGenerator;

public class InsuranceFactory {

    public static Insurance getInsurance(String iName, String iCoverage){

        return new Insurance.Builder()
                   .insuranceId(IdGenerator.generateId())
                   .insurerName(iName)
                   .insuranceCoverage(iCoverage)
                   .build();

    }

}
