package c.service.employee;

import c.domain.employee.Panelbeater;
import c.service.Service;

import java.util.Set;

public interface PanelbeaterService extends Service<Panelbeater, Integer> {

    Set<Panelbeater>getAll();

}
