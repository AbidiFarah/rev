package com.example.revision.Repository;

import com.example.revision.Entity.Contrat;
import com.example.revision.Entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDepartement extends JpaRepository<Departement,Integer> {


}
