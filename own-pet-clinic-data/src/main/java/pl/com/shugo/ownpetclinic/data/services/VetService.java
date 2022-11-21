package pl.com.shugo.ownpetclinic.data.services;

import pl.com.shugo.ownpetclinic.data.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
