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
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer idEquipe ;
    private String nomEquipe ;
    private Niveau niveau;
    @JsonIgnore
    @ManyToMany(mappedBy = "equipes")
    private List<Etudiant> etudiants;
    @OneToOne(mappedBy = "detailEquipe")
    private DetailEquipe detailEquipe ;

}
