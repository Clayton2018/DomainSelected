package c.repositories.workshop;

import c.domain.workshop.Location;
import c.domain.workshop.Workshop;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface LocationRepository extends CrudRepository<Location, Integer> {

    Set<Location>getAll();

}
