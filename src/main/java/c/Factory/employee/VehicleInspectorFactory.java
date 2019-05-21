package c.Factory.employee;

import c.domain.employee.VehicleInspector;
import c.domain.vehicle.Vehicle;

import java.util.List;

public class VehicleInspectorFactory {

    public static VehicleInspector getVehicleInspector(String specialization, List<Vehicle> vehicles, int id, String name, String lastName, String title, String address, String tel, String empDate){

        return (VehicleInspector) new VehicleInspector.VehicleInspectorBuilder()
                      .build();

    }

}
