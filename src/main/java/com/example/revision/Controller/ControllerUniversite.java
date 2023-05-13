package com.example.revision.Controller;

import com.example.revision.Entity.Etudiant;
import com.example.revision.Entity.Universite;
import com.example.revision.Service.Etudiant.IServiceEtudiant;
import com.example.revision.Service.Universite.IServiceUniversite;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/universite")
public class ControllerUniversite {

    private final IServiceUniversite iServiceUniversite;
    @GetMapping()
    List<Universite> retrieveAllUniversites(){ return iServiceUniversite.retrieveAllUniversites();}

    @PostMapping()
    Universite addUniversite(@RequestBody Universite universite){ return iServiceUniversite.addUniversite(universite);}

    @PutMapping()
    Universite updateUniversite (@RequestBody Universite universite){ return iServiceUniversite.updateUniversite(universite);}
    @GetMapping("/{idUniversite}")
    Universite retrieveUniversite(@PathVariable("idUniversite")Integer idUniversite){ return iServiceUniversite.retrieveUniversite(idUniversite);}

    @PutMapping("/{idUniversite}/{idDepart}")
    void assignUniversiteToDepartement (@PathVariable("idUniversite")Integer idUniversite , @PathVariable("idDepart") Integer idDepart)
    {
         iServiceUniversite.assignUniversiteToDepartement(idUniversite,idDepart);
    }

}
