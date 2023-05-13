package com.example.revision.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer idEtudiant ;
    private String prenomE ;
    private String nomE ;
    private Option option ;

    @OneToMany(mappedBy = "etudiantContart")
    private List<Contrat> contrats;

    @ManyToMany
    private List<Equipe> equipes;

    @ManyToOne
    private Departement departement;



}
