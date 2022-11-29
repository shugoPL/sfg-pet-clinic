package pl.com.shugo.ownpetclinic.data.services.map;

import org.springframework.stereotype.Service;
import pl.com.shugo.ownpetclinic.data.model.Visit;
import pl.com.shugo.ownpetclinic.data.services.VisitService;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {
       if(object.getPet() == null
               || object.getPet().getOwner() == null
               || object.getPet().getId() == null) {
           throw new RuntimeException("invalid visit!");
       }
       return super.save(object);
    }

    @Override
    public void delete(Visit obj) {
        super.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
