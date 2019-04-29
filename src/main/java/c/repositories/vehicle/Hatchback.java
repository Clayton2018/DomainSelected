package c.repositories.vehicle;

import c.repositories.Repository;

import java.util.Set;

public interface Hatchback extends Repository<Hatchback, Integer> {

    Set<Hatchback>getAll();

}
