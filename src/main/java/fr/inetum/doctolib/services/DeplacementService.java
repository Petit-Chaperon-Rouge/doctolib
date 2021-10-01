package fr.inetum.doctolib.services;

import fr.inetum.doctolib.models.Deplacement;

import java.util.List;

public interface DeplacementService {
    
    List<Deplacement> findAll();
    Deplacement findById(Integer id);
    Deplacement create(Deplacement deplacement);
    Deplacement put(Deplacement deplacement);
    void deleteById(Integer id);
    
}
