package c.domain.vehicleservice;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class AccidentDamageRepair {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String accidentID;
    private String accidentCode;  // of the extent of the damage.
    private String accidentDescription;
    private double estimatedCostToRepair;
    private String estimatedRepairTime;


    public AccidentDamageRepair() {
    }

    public AccidentDamageRepair(AccidentDamageRepairBuilder builder) {

        this.accidentID = builder.accidentID;
        this.accidentCode = builder.accidentCode;
        this.accidentDescription = builder.accidentDescription;
        this.estimatedCostToRepair = builder.estimatedCostToRepair;
        this.estimatedRepairTime = builder.estimatedRepairTime;

    }

    public String getAccidentID() {
        return accidentID;
    }

    public String getAccidentCode() {
        return accidentCode;
    }

    public String getAccidentDescription() {
        return accidentDescription;
    }

    public double getEstimatedCostToRepair() {
        return estimatedCostToRepair;
    }

    public String getEstimatedRepairTime() {
        return estimatedRepairTime;
    }

    public static class AccidentDamageRepairBuilder{

        private String accidentID;
        private String accidentCode;  //rating of the extent of the damage.
        private String accidentDescription;
        private double estimatedCostToRepair;
        private String estimatedRepairTime;

        public AccidentDamageRepairBuilder accidentID(String accidentID){

            this.accidentID = accidentID;
            return this;

        }

        public AccidentDamageRepairBuilder accidentCode(String accidentCode){

            this.accidentCode = accidentCode;
            return this;

        }

        public AccidentDamageRepairBuilder accidentDescription(String accidentDescription){

            this.accidentDescription = accidentDescription;
            return this;

        }

        public AccidentDamageRepairBuilder estimatedCostToRepair(double estimatedCostToRepair){

            this.estimatedCostToRepair = estimatedCostToRepair;
            return this;

        }

        public AccidentDamageRepairBuilder estimatedRepairTime(String estimatedRepairTime){

            this.estimatedRepairTime = estimatedRepairTime;
            return this;

        }

        public AccidentDamageRepair build(){

            return new AccidentDamageRepair();

        }

        public AccidentDamageRepairBuilder copy(AccidentDamageRepair accident){

            this.accidentID(accident.getAccidentID());
            this.accidentCode(accident.getAccidentCode());
            this.accidentDescription(accident.getAccidentDescription());
            this.estimatedCostToRepair(accident.getEstimatedCostToRepair());
            this.estimatedRepairTime(accident.getEstimatedRepairTime());
            return this;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof AccidentDamageRepairBuilder)) return false;
            AccidentDamageRepairBuilder that = (AccidentDamageRepairBuilder) o;
            return accidentCode == that.accidentCode &&
                    Double.compare(that.estimatedCostToRepair, estimatedCostToRepair) == 0 &&
                    accidentDescription.equals(that.accidentDescription) &&
                    estimatedRepairTime.equals(that.estimatedRepairTime);
        }

        @Override
        public int hashCode() {
            return Objects.hash(accidentCode, accidentDescription, estimatedCostToRepair, estimatedRepairTime);
        }

        @Override
        public String toString() {
            return "AccidentDamageRepairBuilder" + "\n"+
                    "accidentCode=" + accidentCode +
                    ", accidentDescription='" + accidentDescription + '\'' +
                    ", estimatedCostToRepair=" + estimatedCostToRepair +
                    ", estimatedRepairTime='" + estimatedRepairTime + '\'' +
                    "\n";
        }
    }//end inner AccidentDamageRepairBuilder class

}//end of class


