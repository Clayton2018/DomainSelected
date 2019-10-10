package c.domain.workshop;

import c.domain.customer.Customer;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Equipment {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String equipID;
    private String equipName;
    private String workshopName;

    public Equipment(){}

    public Equipment(EquipmentBuilder builder){

        this.equipName = builder.equipName;
        this.equipID = builder.equipID;
        this.workshopName = builder.workshopName;

    }

    public String getEquipID() {
        return equipID;
    }

    public String getEquipName() {
        return equipName;
    }

    public String getWorkshopName() {
        return workshopName;
    }


       public static class EquipmentBuilder{

        private String equipID;
        private String equipName;
        private String workshopName;

        public EquipmentBuilder(){

        }

        public EquipmentBuilder equipID(String equipID){

            this.equipID = equipID;
            return this;

        }

        public EquipmentBuilder equipName(String equipName){

            this.equipName = equipName;
            return this;

        }

        public EquipmentBuilder workshopName(String workshopName){

            this.workshopName = workshopName;
            return this;

        }

        public EquipmentBuilder copy(Equipment equipment){

            this.equipID(equipment.getEquipID());
            this.equipName(equipment.getEquipName());
            this.workshopName(equipment.getWorkshopName());
            return this;

        }

        public Equipment build(){

            return new Equipment(this);

        }

        @Override
        public String toString(){

            return "Equipment\n" + "ID: " + equipID
                    + ", " + "Name: " + equipName +
                    ", " + "Workshop name" + workshopName + "\n";

        }

           @Override
           public boolean equals(Object o) {
               if (this == o) return true;
               if (!(o instanceof EquipmentBuilder)) return false;
               EquipmentBuilder that = (EquipmentBuilder) o;
               return equipID.equals(that.equipID) &&
                       Objects.equals(equipName, that.equipName) &&
                       Objects.equals(workshopName, that.workshopName);
           }

           @Override
           public int hashCode() {
               return Objects.hash(equipID, equipName, workshopName);
           }
       }

}
