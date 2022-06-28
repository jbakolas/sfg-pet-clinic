package guru.springframework.jiji.service.resource;

import guru.springframework.jiji.model.Owner;

public interface OwnerService extends GenericService<Owner, Long> {

    Owner findByLastName(String lastName);

}
