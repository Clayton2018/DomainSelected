package c.domain.workshop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@Entity
public class Workshop extends Location{


    @Id
    @Column(name = "workshop_name" , nullable = false, columnDefinition = "VARCHAR(25)")
    private String workshopName;
    private int noOfEmployees;
    private int locationID;
    private int equipmentID;

    public Workshop() {
    }

    public Workshop(WorkshopBuilder builder) {

        super(builder);
        this.workshopName = builder.workshopName;
        this.noOfEmployees = builder.noOfEmployees;
        this.locationID = builder.locationID;
        this.equipmentID = builder.equipmentID;

    }

    public String getWorkshopName() {
        return workshopName;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public int getLocationID() {
        return locationID;
    }

    public int getEquipmentID() {
        return equipmentID;
    }

    public static class WorkshopBuilder extends Location.Builder{

        private String workshopName;
        private int noOfEmployees;
        private int locationID;
        private int equipmentID;

        public WorkshopBuilder(){

            super();

        }

        public WorkshopBuilder workshopName(String workshopName){

            this.workshopName = workshopName;
            return this;

        }

        public  WorkshopBuilder noOfEmployees(int noOfEmployees){

            this.noOfEmployees = noOfEmployees;
            return this;

        }

        public  WorkshopBuilder locationID(int locationID){

            this.locationID = locationID;
            return this;

        }

        public  WorkshopBuilder equipmentID(int equipmentID){

            this.equipmentID = equipmentID;
            return this;

        }

        public Workshop build(){

            return new Workshop(this);

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof WorkshopBuilder)) return false;
            WorkshopBuilder that = (WorkshopBuilder) o;
            return noOfEmployees == that.noOfEmployees &&
                    locationID == that.locationID &&
                    equipmentID == that.equipmentID &&
                    workshopName.equals(that.workshopName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(workshopName, noOfEmployees, locationID, equipmentID);
        }

        @Override
        public String toString() {
            return "WorkshopBuilder" + "\n" + super.toString() +
                    "workshopName='" + workshopName + '\'' +
                    ", noOfEmployees=" + noOfEmployees +
                    ", locationID=" + locationID +
                    ", equipmentID=" + equipmentID +
                    "\n";
        }

    }//end WorkshopBuilder inner class

}//end Workshop class
