package fr.inetum.doctolib.repositories;

import fr.inetum.doctolib.models.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<Adresse, Integer> {

    public Adresse findByNumeroAndRueAndCpAndVille(String numero, String rue, String cp, String ville);
}
