package gr.springframework.jiji.service.resource;

import gr.springframework.jiji.model.Owner;

public interface OwnerService extends GenericService<Owner, Long> {

    Owner findByLastName(String lastName);

}
