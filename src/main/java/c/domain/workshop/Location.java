package c.domain.workshop;

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

    }


}
