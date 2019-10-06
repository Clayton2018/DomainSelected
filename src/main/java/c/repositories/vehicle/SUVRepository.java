package c.repositories.vehicle;

import c.domain.vehicle.Suv;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface SUVRepository extends CrudRepository<Suv, String> {

    //Set<Suv>getAll();

}
