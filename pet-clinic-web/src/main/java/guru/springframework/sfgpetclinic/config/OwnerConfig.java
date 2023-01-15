package guru.springframework.sfgpetclinic.config;

import gr.springframework.jiji.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.bootstrap.BootstratpData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Import(ApplicationConfig.class)
public class OwnerConfig{

    @Bean
    BootstratpData bootstratpData(OwnerRepository ownerRepository){
        return new BootstratpData(ownerRepository);
    }

}
