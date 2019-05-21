package c.Factory.employee;

import c.domain.employee.Qualification;

public class QualificationFactory {

    public static Qualification getQualification(int qID, String qualName, String instituteName, String duration){

        return (Qualification) new Qualification.Builder()
                .build();

    }

}
