package fr.inetum.doctolib.services.impl;

import fr.inetum.doctolib.models.Deplacement;
import fr.inetum.doctolib.repositories.DeplacementRepository;
import fr.inetum.doctolib.services.DeplacementService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeplacementServiceImpl implements DeplacementService {

    private DeplacementRepository deplacementRepository;

    @Autowired
    public DeplacementServiceImpl(DeplacementRepository deplacementRepository) {
        this.deplacementRepository = deplacementRepository;
    }

    @Override
    public List<Deplacement> findAll() {
        return this.deplacementRepository.findAll();
    }

    @Override
    public Deplacement findById(Integer id) {
        return this.deplacementRepository.findById(id).orElse(null);
    }

    @Override
    public Deplacement create(Deplacement deplacement) {
        return this.deplacementRepository.save(deplacement);
    }

    @Override
    public Deplacement put(Deplacement deplacement) {
        return this.deplacementRepository.save(deplacement);
    }

    @Override
    public void deleteById(Integer id) {
        this.deplacementRepository.deleteById(id);
    }
    
}
