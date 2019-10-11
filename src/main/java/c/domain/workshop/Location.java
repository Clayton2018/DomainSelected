package c.domain.workshop;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Location {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "area_id" , nullable = false, columnDefinition = "VARCHAR(25)")
    private String areaID;
    private String areaName;


    public Location(){

    }

    public Location(Builder builder){

        this.areaID = builder.areaID;
        this.areaName = builder.areaName;

    }

    public String getAreaID() {
        return areaID;
    }

    public String getAreaName() {
        return areaName;
    }

    public static abstract class Builder{

         private String areaID;
         private String areaName;


        public Builder areaID(String areaID){

            this.areaID = areaID;
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
                    "areaID=" + areaID +
                    ", areaName='" + areaName + '\'' +
                    "\n";
        }


    }//end builder inner class


}//end location class
