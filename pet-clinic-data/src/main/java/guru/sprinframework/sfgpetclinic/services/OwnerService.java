package guru.sprinframework.sfgpetclinic.services;

import guru.sprinframework.sfgpetclinic.model.Owner;

public interface OwnerService extends GenericService<Owner> {

    Owner findByLastName(String lastName);

}
