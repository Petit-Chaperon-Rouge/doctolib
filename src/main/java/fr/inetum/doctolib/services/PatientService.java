package fr.inetum.doctolib.services;

import fr.inetum.doctolib.models.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> findAll();
    Patient findById(Integer id);
    Patient create(Patient patient);
    Patient put(Patient patient);
    void deleteById(Integer id);
    
}
