package gr.springframework.jiji.service.resource;

import gr.springframework.jiji.model.Pet;

public interface PetService extends GenericService<Pet, Long> {

    Pet findByNameAndOwner(String name, String ownerName);
}
