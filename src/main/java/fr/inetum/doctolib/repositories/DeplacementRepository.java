package fr.inetum.doctolib.repositories;

import fr.inetum.doctolib.models.Deplacement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeplacementRepository extends JpaRepository<Deplacement, Integer> {
    List<Deplacement> findByPatientId(Integer id);
    List<Deplacement> findByInfirmiereId(Integer id);
}
