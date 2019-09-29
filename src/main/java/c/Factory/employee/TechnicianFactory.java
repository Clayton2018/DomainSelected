package c.Factory.employee;

import c.domain.employee.Technician;

public class TechnicianFactory {

    public static Technician getTechnician(int id, String name, String lastName, String title, String address, String tel, String empDate, String type, double rate){

        return (Technician) new Technician.TechnicianBuilder()
                .empID(id)
                .empName(name)
                .empSurname(lastName)
                .empJobTitle(title)
                .empAddress(address)
                .empTel(tel)
                .employmentDate(empDate)
                .empPay(rate)
                .build();

    }

}
