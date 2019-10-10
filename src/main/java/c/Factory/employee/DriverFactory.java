package c.Factory.employee;

import c.domain.employee.Driver;
import c.util.IdGenerator;

import java.util.Date;

public class DriverFactory {

    public static Driver getDriver(String name, String lastName, String title, String address, String tel, Date empDate, String license){

        return (Driver) new Driver.DriverBuilder()
                .licenseType(license)
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
