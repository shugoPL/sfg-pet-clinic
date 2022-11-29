package pl.com.shugo.ownpetclinic.data.services;

import pl.com.shugo.ownpetclinic.data.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>  {
    Owner findByLastName(String lastName);

}
