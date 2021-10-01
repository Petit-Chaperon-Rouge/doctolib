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

    @DeleteMapping
    public void deleteById(@PathVariable Integer id) {
        LOGGER.info("Suppression d'un deplacement");
        deplacementService.deleteById(id);
    }

}
