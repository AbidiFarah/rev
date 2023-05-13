package com.example.revision.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)

    private Integer idContrat;
    private Date dateDebutContrat ;

    private Date dateFinContart;
    private Specialite specialite;
    private Boolean archive ;
    private Integer montantContrat ;
    @ManyToOne
    private Etudiant etudiantContart;

}
