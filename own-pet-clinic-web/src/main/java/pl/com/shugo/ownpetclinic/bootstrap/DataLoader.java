package pl.com.shugo.ownpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.com.shugo.ownpetclinic.data.model.Owner;
import pl.com.shugo.ownpetclinic.data.model.Vet;
import pl.com.shugo.ownpetclinic.data.services.OwnerService;
import pl.com.shugo.ownpetclinic.data.services.VetService;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

//    public DataLoader() {
//        this.ownerService = new OwnerServiceMap();
//        this.vetService = new VetServiceMap();
//    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 =  new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 =  new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        Owner owner3 =  new Owner();
        owner3.setFirstName("Michael");
        owner3.setLastName("Buble");
        ownerService.save(owner3);

        System.out.println("Loaded owners....");


        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Samuel");
        vet2.setLastName("Keathon");
        vetService.save(vet2);

        System.out.println("Loaded vets....");

    }
}
