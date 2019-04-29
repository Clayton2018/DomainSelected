package c.repositories.workshop;

import c.domain.workshop.Location;
import c.repositories.Repository;

import java.util.Set;

public interface LocationRepository extends Repository<LocationRepository, Integer> {

    Set<Location>getAll();

}
