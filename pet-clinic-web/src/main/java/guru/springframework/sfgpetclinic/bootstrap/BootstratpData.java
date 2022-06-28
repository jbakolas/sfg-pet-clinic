package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.jiji.model.Owner;
import guru.springframework.jiji.repositories.OwnerRepository;
import org.springframework.boot.CommandLineRunner;

public class BootstratpData implements CommandLineRunner {
    private final OwnerRepository ownerRepository;

    public BootstratpData(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        final Owner owner1 = new Owner();
        owner1.setFirstName("JiJi");
        owner1.setLastName("Baby");


        ownerRepository.save(owner1);

        System.out.println("Owners persisted : " + ownerRepository.count());


    }
}
