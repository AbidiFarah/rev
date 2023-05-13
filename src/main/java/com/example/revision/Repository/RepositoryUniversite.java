package com.example.revision.Repository;

import com.example.revision.Entity.Etudiant;
import com.example.revision.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUniversite extends JpaRepository<Universite,Integer> {


}
