package c.Factory.employee;

import c.domain.employee.Technician;
import c.util.IdGenerator;

import java.util.Date;

public class TechnicianFactory {

    public static Technician getTechnician(String specialization, String name, String lastName, String title, String address, String tel, String empDate, String type, double sal){

        return (Technician) new Technician.TechnicianBuilder()
                .specialization(specialization)
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
