package guru.springframework.sfgpetclinic.controller;

import guru.springframework.jiji.model.Owner;
import guru.springframework.jiji.service.resource.OwnerService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/owners")
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/fetchAll")
    Set<Owner> fetchOwners() {
        return ownerService.findAll();
    }

    @GetMapping("/welcome")
    String welcome() {
        return "YO";
    }

    @PostMapping("/save")
    Owner saveOwner(@RequestBody Owner owner) {
        return ownerService.save(owner);
    }
}
