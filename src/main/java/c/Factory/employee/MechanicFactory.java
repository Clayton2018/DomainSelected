package c.Factory.employee;

import c.domain.employee.Mechanic;

public class MechanicFactory {

    public static Mechanic getMechanic(String name, String surname,int id){

        return (Mechanic) new Mechanic.MechanicBuilder()
                .empID(id)
                .empName(name)
                .empSurname(surname)
                .build();

    }

}
