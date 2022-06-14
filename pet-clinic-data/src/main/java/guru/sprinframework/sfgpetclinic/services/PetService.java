package guru.sprinframework.sfgpetclinic.services;

import guru.sprinframework.sfgpetclinic.model.Pet;

public interface PetService extends GenericService<Pet> {

    Pet findByNameAndOwner(String name, String ownerName);

}
