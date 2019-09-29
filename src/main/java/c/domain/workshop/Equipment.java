package c.domain.workshop;

import c.domain.customer.Customer;

import java.util.Objects;

public class Equipment {

    private int equipNum;
    private String equipName;

    public Equipment(){}

    public Equipment(EquipmentBuilder builder){

        this.equipName = builder.equipName;
        this.equipNum = builder.equipNum;
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

    public static class EquipmentBuilder{

        private int equipNum;
        private String equipName;

        public EquipmentBuilder(){}

        public EquipmentBuilder equipNum(int equipNum){

            this.equipNum = equipNum;
            return this;

        }

        public EquipmentBuilder equipName(String equipName){

            this.equipName = equipName;
            return this;

        }

        public Equipment build(){

            return new Equipment(this);

        }

        @Override
        public String toString(){

            return "Equipment\n" + "ID: " + equipNum
                    + "Name: " + equipName + "\n";

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
