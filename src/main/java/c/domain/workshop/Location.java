package c.domain.workshop;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Location extends Workshop {


    private int areaCode;
    private String areaName;


    public Location(){

    }

    public Location(Builder builder){

        this.areaCode = builder.areaCode;
        this.areaName = builder.areaName;

    }

    public int getAreaCode() {
        return areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public static class Builder{

         private int areaCode;
         private String areaName;


        public Builder areaCode(int areaCode){

            this.areaCode = areaCode;
            return this;

        }

        public Builder areaName(String areaName){

            this.areaName = areaName;
            return this;

        }

        public Location build(){

            return new Location(this);

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder)) return false;
            Builder builder = (Builder) o;
            return areaCode == builder.areaCode &&
                    areaName.equals(builder.areaName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(areaCode, areaName);
        }

        @Override
        public String toString() {
            return "Builder " + "\n" +
                    "areaCode=" + areaCode +
                    ", areaName='" + areaName + '\'' +
                    "\n";
        }


    }//end builder inner class


}//end location class
