package c.repositories.workshop;

import c.domain.workshop.Location;
import c.domain.workshop.Workshop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

    Set<Location>getAll();

}
