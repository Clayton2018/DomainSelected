package c.Factory.employee;

import c.domain.employee.Administrator;

public class AdministratorFactory {

    public static Administrator getAdministrator(int empId, String type){

        return (Administrator) new Administrator.AdminBuilder()
                .type(type)
                .empID(empId)
                .build();

    }

}
