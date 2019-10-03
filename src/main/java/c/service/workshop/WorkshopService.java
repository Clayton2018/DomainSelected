package c.service.workshop;

import c.domain.workshop.Workshop;
import c.service.Service;

import java.util.Set;

public interface WorkshopService extends Service<Workshop, String> {

    Set<Workshop>getAll();

}
