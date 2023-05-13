package com.example.revision.Service.Universite;

import com.example.revision.Entity.Departement;
import com.example.revision.Entity.Universite;
import com.example.revision.Repository.RepositoryDepartement;
import com.example.revision.Repository.RepositoryUniversite;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ServiceUniversite implements IServiceUniversite{
    private final RepositoryUniversite repositoryUniversite;
    private final RepositoryDepartement repositoryDepartement ;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return repositoryUniversite.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return repositoryUniversite.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return repositoryUniversite.save(u);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return repositoryUniversite.findById(idUniversite).orElse(null);
    }
    @Transactional
    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite universite= repositoryUniversite.findById(idUniversite).orElse(null);
        Assert.notNull(universite,"universite is null");
        Departement departement = repositoryDepartement.findById(idDepartement).orElse(null);
        Assert.notNull(universite,"departement is null");
        if(universite.getDepartements() == null){
            List<Departement> departementList = new ArrayList<>();
            departementList.add(departement);
            universite.setDepartements(departementList);
        }else {
            universite.getDepartements().add(departement);
        }

        repositoryUniversite.save(universite);


    }
}
