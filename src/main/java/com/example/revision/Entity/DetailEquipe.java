package com.example.revision.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer idDetailEquipe ;
    private Integer salle ;
    private String thematique ;
    @OneToOne
    private DetailEquipe detailEquipe;
}
