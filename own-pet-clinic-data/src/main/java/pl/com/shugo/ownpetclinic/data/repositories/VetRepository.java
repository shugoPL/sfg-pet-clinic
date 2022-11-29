package pl.com.shugo.ownpetclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.com.shugo.ownpetclinic.data.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
