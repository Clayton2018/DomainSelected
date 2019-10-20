package c.Factory.employee;

import c.domain.employee.VehicleInspector;
import c.domain.vehicle.Vehicle;
import c.util.IdGenerator;

import java.util.Date;
import java.util.List;

public class VehicleInspectorFactory {

    public static VehicleInspector getVehicleInspector(String specialization, int id, String name, String lastName, String title, String address, String tel, String empDate, double pay){

        return (VehicleInspector) new VehicleInspector.VehicleInspectorBuilder()
                .specialization(specialization)
                .empID(IdGenerator.generateId())
                .empAddress(address)
                .empJobTitle(title)
                .employmentDate(empDate)
                .empName(name)
                .empSurname(lastName)
                .salary(pay)
                .empTel(tel)
                .build();

    }

}
