package c.Factory.employee;

import c.domain.employee.Administrator;
import c.util.IdGenerator;

import java.util.Date;

public class AdministratorFactory {

    public static Administrator getAdministrator(String name, String lastName, String title, String address, String tel, String empDate, double sal, String type){

        return (Administrator) new Administrator.AdminBuilder()
                .type(type)
                .empID(IdGenerator.generateId())
                .empName(name)
                .empSurname(lastName)
                .empJobTitle(title)
                .empAddress(address)
                .empTel(tel)
                .employmentDate(empDate)
                .salary(sal)
                .build();

    }

}
