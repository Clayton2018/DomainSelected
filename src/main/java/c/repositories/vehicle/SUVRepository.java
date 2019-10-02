package c.repositories.vehicle;

import c.domain.vehicle.Suv;
import c.repositories.Repository;

import java.util.Set;

public interface SUVRepository extends Repository<Suv, String> {

    Set<Suv>getAll();

}
