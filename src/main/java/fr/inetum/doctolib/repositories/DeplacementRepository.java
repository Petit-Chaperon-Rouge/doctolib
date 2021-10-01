package fr.inetum.doctolib.repositories;

import fr.inetum.doctolib.models.Deplacement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeplacementRepository extends JpaRepository<Deplacement, Integer> {}
