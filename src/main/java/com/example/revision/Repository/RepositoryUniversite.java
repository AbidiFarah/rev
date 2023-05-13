package com.example.revision.Repository;

import com.example.revision.Entity.Equipe;
import com.example.revision.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEtudiant extends JpaRepository<Etudiant,Integer> {


}
