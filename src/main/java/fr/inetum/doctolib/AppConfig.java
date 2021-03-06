package fr.inetum.doctolib;

import fr.inetum.doctolib.repositories.AdresseRepository;
import fr.inetum.doctolib.repositories.DeplacementRepository;
import fr.inetum.doctolib.repositories.InfirmiereRepository;
import fr.inetum.doctolib.repositories.PatientRepository;
import fr.inetum.doctolib.services.AdresseService;
import fr.inetum.doctolib.services.DeplacementService;
import fr.inetum.doctolib.services.InfirmiereService;
import fr.inetum.doctolib.services.PatientService;
import fr.inetum.doctolib.services.impl.AdresseServiceImpl;
import fr.inetum.doctolib.services.impl.DeplacementServiceImpl;
import fr.inetum.doctolib.services.impl.InfirmiereServiceImpl;
import fr.inetum.doctolib.services.impl.PatientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public InfirmiereService infirmiereService(InfirmiereRepository infirmiereRepository) {
        return new InfirmiereServiceImpl(infirmiereRepository);
    }

    @Bean
    public PatientService patientService(PatientRepository patientRepository) {
        return new PatientServiceImpl(patientRepository);
    }

    @Bean
    public DeplacementService deplacementService(DeplacementRepository deplacementRepository) {
        return new DeplacementServiceImpl(deplacementRepository);
    }

    @Bean
    public AdresseService adresseService(AdresseRepository adresseRepository) {
        return new AdresseServiceImpl(adresseRepository);
    }

}
