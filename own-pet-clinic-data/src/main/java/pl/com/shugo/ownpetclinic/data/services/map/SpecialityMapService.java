package pl.com.shugo.ownpetclinic.data.services.map;

import pl.com.shugo.ownpetclinic.data.model.Specialty;
import pl.com.shugo.ownpetclinic.data.services.SpecialityService;

import java.util.Set;


public class SpecialityMapService extends AbstractMapService<Specialty, Long> implements SpecialityService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty obj) {
        super.delete(obj);
    }
}
