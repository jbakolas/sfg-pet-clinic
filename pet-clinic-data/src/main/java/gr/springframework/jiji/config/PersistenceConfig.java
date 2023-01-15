package gr.springframework.jiji.config;

import gr.springframework.jiji.audit.AuditAwareImpl;
import gr.springframework.jiji.repositories.OwnerRepository;
import gr.springframework.jiji.service.implementation.OwnerServiceImpl;
import gr.springframework.jiji.service.resource.OwnerService;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories({"gr.springframework"})
@EntityScan({"gr.springframework"})
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class PersistenceConfig {

    @Bean
    AuditorAware<String> auditorAware() {
        return new AuditAwareImpl();
    }

    @Bean
    @Profile({"default", "JPA"})
    OwnerService ownerService(OwnerRepository ownerRepository) {
        return new OwnerServiceImpl(ownerRepository);
    }

}
