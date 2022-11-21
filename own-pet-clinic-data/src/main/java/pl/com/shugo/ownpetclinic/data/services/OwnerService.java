package pl.com.shugo.ownpetclinic.data.services;

import pl.com.shugo.ownpetclinic.data.model.Owner;

import java.util.Set;

public interface OwnerService  {

    Owner findByLastName();

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
