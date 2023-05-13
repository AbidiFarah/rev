package com.example.revision.Repository;

import com.example.revision.Entity.Departement;
import com.example.revision.Entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEquipe extends JpaRepository<Equipe,Integer> {


}
