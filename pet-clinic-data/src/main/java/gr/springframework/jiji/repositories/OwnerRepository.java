package gr.springframework.jiji.repositories;

import gr.springframework.jiji.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Owner findOwnerByLastName(String lastName);
}
