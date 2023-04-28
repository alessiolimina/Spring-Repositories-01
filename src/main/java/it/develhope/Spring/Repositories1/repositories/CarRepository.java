package it.develhope.Spring.Repositories1.repositories;

import it.develhope.Spring.Repositories1.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository <Car, Long> {
}
