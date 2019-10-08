package c.domain.workshop;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public abstract class Location {


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

    public static abstract class Builder{

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

        public abstract Location build();

        @Override
        public String toString() {
            return "Builder " + "\n" +
                    "areaCode=" + areaCode +
                    ", areaName='" + areaName + '\'' +
                    "\n";
        }


    }//end builder inner class


}//end location class
