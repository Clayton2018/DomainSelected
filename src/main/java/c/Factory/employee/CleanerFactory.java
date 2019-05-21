package c.Factory.employee;

import c.domain.employee.Cleaner;

public class CleanerFactory {

    public static Cleaner getCleaner(int id){

        return (Cleaner) new Cleaner.CleanerBuilder()
                .empID(id)
                .empJobTitle("Workshop cleaner")
                .build();

    }

}
