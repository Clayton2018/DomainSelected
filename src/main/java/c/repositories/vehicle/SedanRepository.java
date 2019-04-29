package c.repositories.vehicle;

import c.domain.vehicle.Sedan;
import c.repositories.Repository;

import java.util.Set;

public interface SedanRepository extends Repository<Sedan, Integer> {

    Set<Sedan>getAll();

}
