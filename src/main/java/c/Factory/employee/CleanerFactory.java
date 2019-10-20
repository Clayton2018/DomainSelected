package c.Factory.employee;

import c.domain.employee.Cleaner;
import c.util.IdGenerator;

import java.util.Date;

public class CleanerFactory {

    public static Cleaner getCleaner(String name, String lastName, String title, String address, String tel, String empDate){

        return (Cleaner) new Cleaner.CleanerBuilder()
                .empID(IdGenerator.generateId())
                .empName(name)
                .empSurname(lastName)
                .empJobTitle(title)
                .empAddress(address)
                .empTel(tel)
                .employmentDate(empDate)
                .build();

    }

}
