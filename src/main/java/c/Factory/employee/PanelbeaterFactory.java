package c.Factory.employee;

import c.domain.employee.Panelbeater;
import c.util.IdGenerator;

import java.util.Date;

public class PanelbeaterFactory {

    public static Panelbeater getPanelbeater(String name, String lastName, String title, String address, String tel, String empDate, double sal){

        return (Panelbeater) new Panelbeater.PanelbeaterBuilder()
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
