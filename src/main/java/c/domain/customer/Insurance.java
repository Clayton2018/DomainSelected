package c.domain.customer;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Insurance {


    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String insuranceId;
    private String insurerName;
    private String insuranceCoverage;   //Example: accidental, 3rd party, full, minor.

    public Insurance() {

    }//end empty insurance constructor


    public Insurance(Builder builder) {

        this.insuranceId = builder.insuranceId;
        this.insurerName = builder.insurerName;
        this.insuranceCoverage = builder.insuranceCoverage;

    }//end constructor

    public String getInsuranceId() {
        return insuranceId;
    }

    public String getInsurerName() {
        return insurerName;
    }

    public String getInsuranceCoverage() {
        return insuranceCoverage;
    }

    public static class Builder{

        private String insuranceId;
        private String insurerName;
        private String insuranceCoverage;


        public Builder insuranceId(String insuranceId) {

            this.insuranceId = insuranceId;
            return this;

        }

        public Builder insurerName(String insurerName) {

            this.insurerName = insurerName;
            return this;

        }

        public Builder insuranceCoverage(String insuranceCoverage) {

            this.insuranceCoverage = insuranceCoverage;
            return this;

        }

        public Insurance build(){

            return new Insurance(this);

        }

        @Override
        public String toString() {
            return "Builder \n" +
                    "insuranceId=" + insuranceId +
                    ", insurerName='" + insurerName + '\'' +
                    ", insuranceCoverage='" + insuranceCoverage + "\n";

        }//end to String


    } //end Builder inner class




}//end Insurance class
