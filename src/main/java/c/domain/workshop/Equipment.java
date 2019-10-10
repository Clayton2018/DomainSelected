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
    private int equipNum;
    private String equipName;
    private String workshopName;

    public Equipment(){}

    public Equipment(EquipmentBuilder builder){

        this.equipName = builder.equipName;
        this.equipNum = builder.equipNum;
        this.workshopName = builder.workshopName;

    }

    public int getEquipNum() {
        return equipNum;
    }

    public void setEquipNum(int equipNum) {
        this.equipNum = equipNum;
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public static class EquipmentBuilder{

        private int equipNum;
        private String equipName;
        private String workshopName;

        public EquipmentBuilder(){

        }

        public EquipmentBuilder equipNum(int equipNum){

            this.equipNum = equipNum;
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

        public Equipment build(){

            return new Equipment(this);

        }

        @Override
        public String toString(){

            return "Equipment\n" + "ID: " + equipNum
                    + ", " + "Name: " + equipName +
                    ", " + "Workshop name" + workshopName + "\n";

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EquipmentBuilder that = (EquipmentBuilder) o;
            return equipNum == that.equipNum &&
                    equipName.equals(that.equipName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(equipNum, equipName);
        }
    }

}
