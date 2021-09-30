package fr.inetum.doctolib.models;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn( name="adresse_id", unique = true )
    private Adresse adresse;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "infirmiere_id", referencedColumnName = "id")
    private Infirmiere infirmiere;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "dateDeNaissance")
    private LocalDate dateDeNaissance;

    @Column(name = "sexe")
    private String sexe;

    @Column(name = "numeroSecuriteSocial")
    private Long numeroSecuriteSocial;


}
