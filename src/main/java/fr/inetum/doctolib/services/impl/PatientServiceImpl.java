package fr.inetum.doctolib.services.impl;

import fr.inetum.doctolib.models.Patient;
import fr.inetum.doctolib.repositories.PatientRepository;
import fr.inetum.doctolib.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> findAll() {
        return this.patientRepository.findAll();
    }

    @Override
    public Patient findById(Integer id) {
        return this.patientRepository.findById(id).orElse(null);
    }

    @Override
    public Patient create(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public Patient put(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public void deleteById(Integer id) {
        this.patientRepository.deleteById(id);
    }
}
