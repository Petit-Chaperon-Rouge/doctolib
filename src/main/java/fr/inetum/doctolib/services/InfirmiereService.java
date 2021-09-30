package fr.inetum.doctolib.services;

import fr.inetum.doctolib.models.Infirmiere;

import java.util.List;

public interface InfirmiereService {

    List<Infirmiere> findAll();
    Infirmiere findById(Integer id);
    Infirmiere create(Infirmiere infirmiere);
    Infirmiere put(Infirmiere infirmiere);
    void deleteById(Integer id);

}
