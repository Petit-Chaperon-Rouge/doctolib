package fr.inetum.doctolib.services.impl;

import fr.inetum.doctolib.models.Adresse;
import fr.inetum.doctolib.repositories.AdresseRepository;
import fr.inetum.doctolib.services.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdresseServiceImpl implements AdresseService {

    private AdresseRepository adresseRepository;

    @Autowired
    public AdresseServiceImpl(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    @Override
    public List<Adresse> findAll() {
        return this.adresseRepository.findAll();
    }

    @Override
    public Adresse findById(Integer id) {
        return this.adresseRepository.findById(id).orElse(null);
    }

    @Override
    public Adresse create(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }

    @Override
    public Adresse put(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }

    @Override
    public void deleteById(Integer id) {
        this.adresseRepository.deleteById(id);
    }
}
