package fr.inetum.doctolib.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import fr.inetum.doctolib.models.enums.SexeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn( name="adresse_id", unique = true )
    private Adresse adresse;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "infirmiere_id", referencedColumnName = "id")
    private Infirmiere infirmiere;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "date_de_naissance")
    private LocalDate dateDeNaissance;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexe", columnDefinition = "ENUM('Homme', 'Femme', 'Autre')")
    private SexeEnum sexe;

    @Column(name = "numero_securite_sociale")
    private Long numeroSecuriteSocial;

}