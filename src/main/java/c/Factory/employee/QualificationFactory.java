package c.Factory.employee;

import c.domain.employee.Qualification;

public class QualificationFactory {

    public static Qualification getQualification(int qID, String qualName, String instituteName, String duration){

        return new Qualification.Builder()
                .qualificationID(qID)
                .qualificationName(qualName)
                .instituteName(instituteName)
                .qualificationDuration(duration)
                .build();

    }

}
