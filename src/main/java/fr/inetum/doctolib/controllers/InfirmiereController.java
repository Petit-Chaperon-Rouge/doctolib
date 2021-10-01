package fr.inetum.doctolib.controllers;

import fr.inetum.doctolib.models.Infirmiere;
import fr.inetum.doctolib.services.InfirmiereService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("infirmieres")
public class InfirmiereController {

    private static Logger LOGGER = LoggerFactory.getLogger(InfirmiereController.class);

    @Autowired
    private InfirmiereService infirmiereService;

    @GetMapping
    public List<Infirmiere> findAll() {
        LOGGER.info("Recherche de toutes les infirmieres");
        return this.infirmiereService.findAll();
    }

    @GetMapping("{id}")
    public Infirmiere findById(@PathVariable Integer id) {
        LOGGER.info("Recherche de l'infirmiere avec l'id " + id);
        return infirmiereService.findById(id);
    }

    @PostMapping
    public Infirmiere create(@RequestBody Infirmiere infirmiere) {
        LOGGER.info("Creation d'une infirmiere");
        return infirmiereService.create(infirmiere);
    }

    @PutMapping
    public Infirmiere put(@RequestBody Infirmiere infirmiere) {
        LOGGER.info("Modification d'une infirmiere");
        return infirmiereService.put(infirmiere);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id) {
        LOGGER.info("Suppression d'une infirmiere");
        infirmiereService.deleteById(id);
    }

}
