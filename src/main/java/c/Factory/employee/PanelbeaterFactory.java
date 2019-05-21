package c.Factory.employee;

import c.domain.employee.Panelbeater;

public class PanelbeaterFactory {

    public static Panelbeater getPanelbeater(int id, String name, String surname){

        return (Panelbeater) new Panelbeater.PanelbeaterBuilder()
                .empID(id)
                .empName(name)
                .empSurname(surname)
                .build();

    }

}
