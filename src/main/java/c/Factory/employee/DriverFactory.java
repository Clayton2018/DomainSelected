package c.Factory.employee;

import c.domain.employee.Driver;

public class DriverFactory {

    public static Driver getDriver(int id, String name, String lastName, String title, String address, String tel, String empDate, String license){

        return (Driver) new Driver.DriverBuilder()
                .licenseType(license)
                .empID(id)
                .empName(name)
                .empSurname(lastName)
                .empJobTitle(title)
                .empAddress(address)
                .empTel(tel)
                .employmentDate(empDate)
                .build();

    }

}
