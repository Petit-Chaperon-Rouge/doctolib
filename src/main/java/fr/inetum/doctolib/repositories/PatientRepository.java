package fr.inetum.doctolib.repositories;

import fr.inetum.doctolib.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {}
