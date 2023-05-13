package com.example.revision.Service.Equipe;

import com.example.revision.Entity.Equipe;

import java.util.List;

public interface IServiceEquipe {

    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);
}
