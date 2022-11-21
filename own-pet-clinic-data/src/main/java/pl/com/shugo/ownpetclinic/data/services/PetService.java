package pl.com.shugo.ownpetclinic.data.services;

import pl.com.shugo.ownpetclinic.data.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
