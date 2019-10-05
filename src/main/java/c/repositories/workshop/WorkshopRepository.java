package c.repositories.workshop;

import c.domain.workshop.Workshop;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface WorkshopRepository extends CrudRepository<Workshop, String> {

    Set<Workshop> getAll();

}
