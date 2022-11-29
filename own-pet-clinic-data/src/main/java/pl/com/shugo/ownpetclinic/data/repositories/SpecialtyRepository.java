package pl.com.shugo.ownpetclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.com.shugo.ownpetclinic.data.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
