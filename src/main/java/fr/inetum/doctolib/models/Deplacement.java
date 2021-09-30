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
@Table(name = "deplacement")
public class Deplacement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "cout")
    private Double cout;

    @OneToOne
    @JoinColumn( name="patient_id" )
    private Patient patient;

    @OneToOne
    @JoinColumn( name="patient_id" )
    private Infirmiere infirmiere;

}
