package com.example.revision.Controller;

import com.example.revision.Entity.Contrat;
import com.example.revision.Entity.Etudiant;
import com.example.revision.Service.Contart.IServiceContart;
import com.example.revision.Service.Etudiant.IServiceEtudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contrat")
public class ControllerContrat {
    private final IServiceContart iServiceContart;
    @GetMapping()
    List<Contrat> retrieveAllContrats(){ return iServiceContart.retrieveAllContrats();}

    @PostMapping()
    Contrat addContrat(@RequestBody Contrat ce){ return iServiceContart.addContrat(ce);}

    @PutMapping()
    Contrat updateContrat (@RequestBody Contrat ce){ return iServiceContart.updateContrat(ce);}
    @GetMapping("/{idContrat}")
    Contrat retrieveContrat(@PathVariable("idContrat") Integer idContrat){ return iServiceContart.retrieveContrat(idContrat);}
    @DeleteMapping("/{idContrat}")
    void removeContrat(@PathVariable("idContrat")Integer idContrat){ iServiceContart.removeContrat(idContrat);}
}
