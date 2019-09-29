package c.Factory.customer;

import c.domain.customer.Insurance;

public class InsuranceFactory {

    public static Insurance getInsurance(int iId, String iName, String iCoverage){

        return new Insurance.Builder()
                   .insuranceId(iId)
                   .insurerName(iName)
                   .insuranceCoverage(iCoverage)
                   .build();

    }

}
