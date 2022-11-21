package pl.com.shugo.ownpetclinic.data.services;


import java.util.Set;

public interface CrudService<T,ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);

    void delete(T obj);
    void deleteById(ID id);


}
