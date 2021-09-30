package fr.inetum.doctolib;

import fr.inetum.doctolib.repositories.InfirmiereRepository;
import fr.inetum.doctolib.services.InfirmiereService;
import fr.inetum.doctolib.services.impl.InfirmiereServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public InfirmiereService infirmiereService(InfirmiereRepository infirmiereRepository) {
        return new InfirmiereServiceImpl(infirmiereRepository);
    }

}
