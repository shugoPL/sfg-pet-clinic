package pl.com.shugo.ownpetclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.com.shugo.ownpetclinic.data.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
