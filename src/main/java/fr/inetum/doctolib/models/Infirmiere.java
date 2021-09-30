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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn( name="adresse_id", unique = true )
    private Adresse adresse;

    @Column(name = "numero_professionnel")
    private Integer numeroProfessionnel;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "tel_pro")
    private String telPro;

    @Column(name = "tel_perso")
    private String telPerso;

//    private List<Patient> patients

}
