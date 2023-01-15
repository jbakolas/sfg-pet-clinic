package gr.springframework.jiji.service.implementation;

import gr.springframework.jiji.model.Owner;
import gr.springframework.jiji.repositories.OwnerRepository;
import gr.springframework.jiji.service.resource.OwnerService;

import java.util.HashSet;
import java.util.Set;

//@Service
//@Profile({"default", "JPA"}) --> instead of stereotypes we use the config approach (better start up performance)
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong)
                .orElse(null);
    }

    @Override
    public Set<Owner> findAll() {
        return new HashSet<>(ownerRepository.findAll());
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findOwnerByLastName(lastName);
    }
}
