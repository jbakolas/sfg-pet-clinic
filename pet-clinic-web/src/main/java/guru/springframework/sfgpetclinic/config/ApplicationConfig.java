package guru.springframework.sfgpetclinic.config;

import guru.springframework.jiji.audit.AuditAwareImpl;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableJpaRepositories("guru.springframework")
@EntityScan("guru.springframework.jiji.model")
public class ApplicationConfig {

    @Bean
    AuditorAware<String> auditorAware() {
        return new AuditAwareImpl();
    }

}
