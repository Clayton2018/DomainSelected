package c.repositories.workshop;

import c.domain.workshop.Workshop;
import c.repositories.Repository;

import java.util.Set;

public interface WorkshopRepository extends Repository<Workshop, String> {

    Set<Workshop> getAll();

}
