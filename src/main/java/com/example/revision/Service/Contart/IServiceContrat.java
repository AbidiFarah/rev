package com.example.revision.Service.Contart;

import com.example.revision.Entity.Contrat;

import java.util.List;

public interface IServiceContart {

    List<Contrat> retrieveAllContrats();

    Contrat updateContrat (Contrat ce);

    Contrat addContrat (Contrat ce);

    Contrat retrieveContrat (Integer idContrat);

    void removeContrat(Integer idContrat);
}
