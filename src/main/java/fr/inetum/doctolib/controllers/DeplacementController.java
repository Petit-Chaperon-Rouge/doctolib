package fr.inetum.doctolib.controllers;

import fr.inetum.doctolib.models.Deplacement;
import fr.inetum.doctolib.services.DeplacementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("deplacements")
public class DeplacementController {

    private static Logger LOGGER = LoggerFactory.getLogger(DeplacementController.class);

    @Autowired
    private DeplacementService deplacementService;

    @GetMapping
    public List<Deplacement> findAll() {
        LOGGER.info("Recherche de tous les deplacements");
        return this.deplacementService.findAll();
    }

    @GetMapping("/patient/{id}")
    public List<Deplacement> findByPatientId(@PathVariable Integer id) {
        LOGGER.info("Recherche de tous les deplacements d'un patient");
        return this.deplacementService.findByPatientId(id);
    }

    @GetMapping("/infirmiere/{id}")
    public List<Deplacement> findByInfirmiereId(@PathVariable Integer id) {
        LOGGER.info("Recherche de tous les deplacements d'une infirmiere");
        return this.deplacementService.findByInfirmiereId(id);
    }

    @GetMapping("{id}")
    public Deplacement findById(@PathVariable Integer id) {
        LOGGER.info("Recherche du deplacement avec l'id " + id);
        return deplacementService.findById(id);
    }

    @PostMapping
    public Deplacement create(@RequestBody Deplacement deplacement) {
        LOGGER.info("Creation d'un deplacement");
        return deplacementService.create(deplacement);
    }

    @PutMapping
    public Deplacement put(@RequestBody Deplacement deplacement) {
        LOGGER.info("Modification d'un deplacement");
        return deplacementService.put(deplacement);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id) {
        LOGGER.info("Suppression d'un deplacement");
        deplacementService.deleteById(id);
    }

}
