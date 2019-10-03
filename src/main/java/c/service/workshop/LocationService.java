package c.service.workshop;

import c.domain.workshop.Location;
import c.service.Service;

import java.util.Set;

public interface LocationService extends Service<Location, Integer> {

    Set<Location>getAll();

}
