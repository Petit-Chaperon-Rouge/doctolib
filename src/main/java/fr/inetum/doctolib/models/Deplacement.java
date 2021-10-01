package fr.inetum.doctolib.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "deplacement")
public class Deplacement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "cout")
    private Double cout;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn( name="patient_id" )
    private Patient patient;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn( name="infirmiere_id" )
    private Infirmiere infirmiere;

}
