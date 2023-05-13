package com.example.revision.Service.Contart;

import com.example.revision.Entity.Contrat;
import com.example.revision.Entity.Etudiant;
import com.example.revision.Repository.RepositoryContrat;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ServiceContart implements IServiceContart{
    private final RepositoryContrat repositoryContrat;
    @Override
    public List<Contrat> retrieveAllContrats() {
        return repositoryContrat.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return repositoryContrat.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return repositoryContrat.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return repositoryContrat.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Integer idContrat) {
       repositoryContrat.deleteById(idContrat);
    }
}
