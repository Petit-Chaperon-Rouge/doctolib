package fr.inetum.doctolib.services.impl;

import fr.inetum.doctolib.models.Infirmiere;
import fr.inetum.doctolib.repositories.InfirmiereRepository;
import fr.inetum.doctolib.services.InfirmiereService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InfirmiereServiceImpl implements InfirmiereService {

    private InfirmiereRepository infirmiereRepository;

    @Autowired
    public InfirmiereServiceImpl(InfirmiereRepository infirmiereRepository) {
        this.infirmiereRepository = infirmiereRepository;
    }

    @Override
    public List<Infirmiere> findAll() {
        return this.infirmiereRepository.findAll();
    }

    @Override
    public Infirmiere findById(Integer id) {
        return this.infirmiereRepository.findById(id).orElse(null);
    }

    @Override
    public Infirmiere create(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public Infirmiere put(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public void deleteById(Integer id) {
        this.infirmiereRepository.deleteById(id);
    }
}
