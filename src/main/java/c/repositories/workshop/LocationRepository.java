package c.repositories.workshop;

import c.domain.workshop.Location;
import c.domain.workshop.Workshop;
import c.repositories.Repository;

import java.util.Set;

public interface LocationRepository extends Repository<Location, Integer> {

    Set<Location>getAll();

}
