package fr.inetum.doctolib.services;

import fr.inetum.doctolib.models.Adresse;

import java.util.List;

public interface AdresseService {

    List<Adresse> findAll();
    Adresse findById(Integer id);
    Adresse create(Adresse adresse);
    Adresse put(Adresse adresse);
    void deleteById(Integer id);
    
}
