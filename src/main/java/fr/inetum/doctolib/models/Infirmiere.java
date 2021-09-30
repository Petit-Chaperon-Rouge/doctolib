package fr.inetum.doctolib.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "infirmiere")
public class Infirmiere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn( name="adresse_id", unique = true )
    private Adresse adresse;

    @Column(name = "numeroProfessionnel")
    private Integer numeroProfessionnel;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "telPro")
    private Integer telPro;

    @Column(name = "telPerso")
    private Integer telPerso;

//    private List<Patient> patients

}
