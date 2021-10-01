package fr.inetum.doctolib.controllers;

import fr.inetum.doctolib.models.Adresse;
import fr.inetum.doctolib.services.AdresseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("adresses")
public class AdresseController {

    private static Logger LOGGER = LoggerFactory.getLogger(AdresseController.class);

    @Autowired
    private AdresseService adresseService;

    @GetMapping
    public List<Adresse> findAll() {
        LOGGER.info("Recherche de toutes les adresses");
        return this.adresseService.findAll();
    }

    @GetMapping("{id}")
    public Adresse findById(@PathVariable Integer id) {
        LOGGER.info("Recherche de l'adresse avec l'id " + id);
        return adresseService.findById(id);
    }

    @PostMapping
    public Adresse create(@RequestBody Adresse adresse) {
        LOGGER.info("Creation d'une adresse");
        return adresseService.create(adresse);
    }

    @PutMapping
    public Adresse put(@RequestBody Adresse adresse) {
        LOGGER.info("Modification d'une adresse");
        return adresseService.put(adresse);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Integer id) {
        LOGGER.info("Suppression d'une adresse");
        adresseService.deleteById(id);
    }

}