package pl.com.shugo.ownpetclinic.data.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.com.shugo.ownpetclinic.data.model.Specialty;
import pl.com.shugo.ownpetclinic.data.repositories.SpecialtyRepository;
import pl.com.shugo.ownpetclinic.data.services.SpecialityService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialityService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
//        Set<Specialty> specs = new HashSet<>(findAll());
        Set<Specialty> specs = new HashSet<>();
        specialtyRepository.findAll().forEach(specs::add);
        return specs;
    }

    @Override
    public Specialty findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty obj) {
        specialtyRepository.delete(obj);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
