package com.example.revision.Repository;

import com.example.revision.Entity.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryContrat extends JpaRepository<Contrat,Integer> {


}
