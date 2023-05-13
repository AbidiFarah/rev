package com.example.revision.Service.Etudiant;

import com.example.revision.Entity.Etudiant;

import java.util.List;

public interface IServiceEtudiant {

    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);
    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,Integer idEquipe);

    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
}
