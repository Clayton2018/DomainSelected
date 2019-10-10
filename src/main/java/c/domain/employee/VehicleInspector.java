package c.domain.employee;

import c.domain.vehicle.Vehicle;

import javax.persistence.Entity;
import java.util.List;
import java.util.Objects;

@Entity
public class VehicleInspector extends Employee{

    private String specialization;

    public VehicleInspector(){

    }

    private VehicleInspector(VehicleInspectorBuilder builder){

        super(builder);
        this.specialization = builder.specialization;

    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public static class VehicleInspectorBuilder extends Employee.Builder{

        private String specialization;

        public VehicleInspectorBuilder(){

            super();

        }

        public VehicleInspectorBuilder specialization(String specialization){

            this.specialization = specialization;
            return this;

        }

        public VehicleInspectorBuilder copy(VehicleInspector vehicleInspector){

            this.empID(vehicleInspector.getEmpID());
            this.empName(vehicleInspector.getEmpName());
            this.empSurname(vehicleInspector.getEmpSurname());
            this.empJobTitle(vehicleInspector.getEmpJobTitle());
            this.empAddress(vehicleInspector.getEmpAddress());
            this.employmentDate(vehicleInspector.getEmploymentDate());
            this.empTel(vehicleInspector.getEmpTel());
            this.specialization(vehicleInspector.getSpecialization());
            return this;

        }

        @Override
        public Employee build(){

            return new VehicleInspector(this);

        }

        @Override
        public String toString(){

            return "VehicleInspectorBuilder{" + "specialization: "
                    + specialization + "\n" + super.toString();

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof VehicleInspectorBuilder)) return false;
            VehicleInspectorBuilder that = (VehicleInspectorBuilder) o;
            return Objects.equals(specialization, that.specialization);
        }

        @Override
        public int hashCode() {
            return Objects.hash(specialization);
        }

    }


}
