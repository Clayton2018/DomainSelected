package c.repositories.vehicle;

import c.domain.vehicle.Suv;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface SUVRepository extends CrudRepository<Suv, String> {

    Set<Suv>getAll();

}
