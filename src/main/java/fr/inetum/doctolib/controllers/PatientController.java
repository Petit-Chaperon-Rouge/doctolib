package fr.inetum.doctolib.controllers;

import fr.inetum.doctolib.models.Patient;
import fr.inetum.doctolib.services.PatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("patients")
public class PatientController {

    private static Logger LOGGER = LoggerFactory.getLogger(PatientController.class);

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> findAll() {
        LOGGER.info("Recherche de tous les patients");
        return this.patientService.findAll();
    }

    @GetMapping("{id}")
    public Patient findById(@PathVariable Integer id) {
        LOGGER.info("Recherche d'un patient avec l'id " + id);
        return patientService.findById(id);
    }

    @PostMapping
    public Patient create(@RequestBody Patient patient) {
        LOGGER.info("Creation d'un patient");
        return patientService.create(patient);
    }

    @PutMapping
    public Patient put(@RequestBody Patient patient) {
        LOGGER.info("Modification d'un patient");
        return patientService.put(patient);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Integer id) {
        LOGGER.info("Suppression d'un patient");
        patientService.deleteById(id);
    }

}
