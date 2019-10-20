package c.Factory.employee;

import c.domain.employee.Mechanic;
import c.util.IdGenerator;

import java.util.Date;

public class MechanicFactory {

    public static Mechanic getMechanic(String allocatedBay, String name, String lastName, String title, String address, String tel, String empDate, double sal){

        return (Mechanic) new Mechanic.MechanicBuilder()
                .allocatedBay(allocatedBay)
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
