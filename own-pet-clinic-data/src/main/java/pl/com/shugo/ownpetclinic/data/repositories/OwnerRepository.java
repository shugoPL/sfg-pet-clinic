package pl.com.shugo.ownpetclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.com.shugo.ownpetclinic.data.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
