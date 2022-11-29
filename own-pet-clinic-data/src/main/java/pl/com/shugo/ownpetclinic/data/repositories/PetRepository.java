package pl.com.shugo.ownpetclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.com.shugo.ownpetclinic.data.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
