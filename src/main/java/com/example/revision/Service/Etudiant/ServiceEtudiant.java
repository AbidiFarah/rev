package com.example.revision.Service.Etudiant;

import com.example.revision.Entity.Contrat;
import com.example.revision.Entity.Departement;
import com.example.revision.Entity.Equipe;
import com.example.revision.Entity.Etudiant;
import com.example.revision.Repository.RepositoryContrat;
import com.example.revision.Repository.RepositoryDepartement;
import com.example.revision.Repository.RepositoryEquipe;
import com.example.revision.Repository.RepositoryEtudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceEtudiant implements IServiceEtudiant{

    private final RepositoryEtudiant repositoryEtudiant ;
    private final RepositoryDepartement repositoryDepartement ;

    private final RepositoryEquipe repositoryEquipe ;
    private final RepositoryContrat repositoryContrat;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return repositoryEtudiant.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return repositoryEtudiant.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return repositoryEtudiant.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return repositoryEtudiant.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        repositoryEtudiant.deleteById(idEtudiant);

    }
    @Transactional
    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant etudiant = repositoryEtudiant.findById(etudiantId).orElse(null);
        Assert.notNull(etudiant ,"this etudiant is null");
        Departement departement = repositoryDepartement.findById(departementId).orElse(null);
        Assert.notNull(departement ,"this departement is null");
        etudiant.setDepartement(departement);

        repositoryEtudiant.save(etudiant);
    }
    @Transactional
    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        repositoryEtudiant.saveAndFlush(e);
            Equipe equipe = repositoryEquipe.findById(idEquipe).orElse(null);
            Contrat contrat = repositoryContrat.findById(idEquipe).orElse(null);
            // affecter contart
            contrat.setEtudiantContart(e);
            repositoryContrat.save(contrat);
            List<Equipe> equipeList = new ArrayList<>();
            equipeList.add(equipe);
            e.setEquipes(equipeL-ist);
         return repositoryEtudiant.save(e);
    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
        return repositoryEtudiant.findEtudiantsByDepartement_IdDepart(idDepartement);
    }
}
