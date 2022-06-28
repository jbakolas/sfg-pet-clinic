package guru.springframework.jiji.service.resource;

import guru.springframework.jiji.model.Pet;

public interface PetService extends GenericService<Pet, Long> {

    Pet findByNameAndOwner(String name, String ownerName);
}
