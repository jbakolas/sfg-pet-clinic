package guru.springframework.sfgpetclinic.config;

import guru.springframework.jiji.repositories.OwnerRepository;
import guru.springframework.jiji.service.implementation.OwnerServiceImpl;
import guru.springframework.jiji.service.resource.OwnerService;
import guru.springframework.sfgpetclinic.bootstrap.BootstratpData;
import org.springframework.context.annotation.*;

@Configuration
@Import(ApplicationConfig.class)
public class OwnerConfig{

    @Bean
    BootstratpData bootstratpData(OwnerRepository ownerRepository){
        return new BootstratpData(ownerRepository);
    }

    @Bean
    @Primary
    @Profile({"default", "JPA"})
    OwnerService ownerService(OwnerRepository ownerRepository){
        return new OwnerServiceImpl(ownerRepository);
    }
}
