package com.example.revision.Service.Equipe;

import com.example.revision.Entity.Equipe;
import com.example.revision.Repository.RepositoryEquipe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ServiceEquipe implements IServiceEquipe {

    private final RepositoryEquipe repositoryEquipe ;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return repositoryEquipe.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return repositoryEquipe.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return repositoryEquipe.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return repositoryEquipe.findById(idEquipe).orElse(null);
    }
}
