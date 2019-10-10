package c.Factory.employee;

import c.domain.employee.Qualification;
import c.util.IdGenerator;

public class QualificationFactory {

    public static Qualification getQualification(String qualName, String instituteName, String duration){

        return new Qualification.Builder()
                .qualificationID(IdGenerator.generateId())
                .qualificationName(qualName)
                .instituteName(instituteName)
                .qualificationDuration(duration)
                .build();

    }

}
