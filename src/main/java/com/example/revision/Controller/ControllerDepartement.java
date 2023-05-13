package com.example.revision.Controller;

import com.example.revision.Entity.Departement;
import com.example.revision.Service.Departement.IServiceDepartement;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departement")
public class ControllerDepartement {

    private final IServiceDepartement iServiceDepartement;
    @GetMapping()
    List<Departement> retrieveAllDepartements(){ return iServiceDepartement.retrieveAllDepartements();}

    @PostMapping()
    Departement addDepartement(@RequestBody Departement departement){ return iServiceDepartement.addDepartement(departement);}

    @PutMapping()
    Departement updateDepartement (@RequestBody Departement departement){ return iServiceDepartement.updateDepartement(departement);}
    @GetMapping("/{idDepart}")
    Departement retrieveDepartement(@PathVariable("idDepart") Integer idDepart){ return iServiceDepartement.retrieveDepartement(idDepart);}

}
