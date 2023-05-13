package com.example.revision.Service.Departement;

import com.example.revision.Entity.Departement;

import java.util.List;

public interface IServiceDepartement {

    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);
}
