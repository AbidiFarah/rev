package com.example.revision.Service.Departement;

import com.example.revision.Entity.Departement;
import com.example.revision.Repository.RepositoryDepartement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ServiceDepartement implements IServiceDepartement{

    private final RepositoryDepartement repositoryDepartement;
    @Override
    public List<Departement> retrieveAllDepartements() {
        return repositoryDepartement.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return repositoryDepartement.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return repositoryDepartement.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return repositoryDepartement.findById(idDepart).orElse(null);
    }
}
