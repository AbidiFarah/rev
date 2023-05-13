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
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)

    private Integer idDepart ;
    private String nomDepart;
    @JsonIgnore
    @OneToMany(mappedBy = "departement")
    private List<Etudiant> etudiantsDepart;
}
