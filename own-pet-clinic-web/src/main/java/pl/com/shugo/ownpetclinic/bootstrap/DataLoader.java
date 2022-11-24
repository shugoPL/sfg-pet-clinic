package pl.com.shugo.ownpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.com.shugo.ownpetclinic.data.model.Owner;
import pl.com.shugo.ownpetclinic.data.model.Pet;
import pl.com.shugo.ownpetclinic.data.model.PetType;
import pl.com.shugo.ownpetclinic.data.model.Vet;
import pl.com.shugo.ownpetclinic.data.services.OwnerService;
import pl.com.shugo.ownpetclinic.data.services.PetTypeService;
import pl.com.shugo.ownpetclinic.data.services.VetService;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 1sr Street");
        owner1.setCity("Miami");
        owner1.setPhone("123123123");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Roscow");
        owner1.addPet(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 2sr Street");
        owner2.setCity("New York");
        owner2.setPhone("432123456");

        Pet fionasCat = new Pet();
        fionasCat.setName("Justcat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.addPet(fionasCat);
        ownerService.save(owner2);

        Owner owner3 = new Owner();
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
