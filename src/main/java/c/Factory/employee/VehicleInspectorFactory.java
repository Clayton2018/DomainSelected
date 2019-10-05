package c.Factory.employee;

import c.domain.employee.VehicleInspector;
import c.domain.vehicle.Vehicle;

import java.util.List;

public class VehicleInspectorFactory {

    public static VehicleInspector getVehicleInspector(String specialization, List<Vehicle> vehicles, int id, String name, String lastName, String title, String address, String tel, String empDate, double pay){

        return (VehicleInspector) new VehicleInspector.VehicleInspectorBuilder()
                .specialization(specialization)
                .vehicles(vehicles)
                .empID(id)
                .empAddress(address)
                .empJobTitle(title)
                .employmentDate(empDate)
                .empName(name)
                .empSurname(lastName)
                .empPay(pay)
                .empTel(tel)
                      .build();

    }

}
