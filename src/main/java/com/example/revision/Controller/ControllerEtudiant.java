package com.example.revision.Controller;

import com.example.revision.Entity.Etudiant;
import com.example.revision.Service.Etudiant.IServiceEtudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/etudiant")
public class ControllerEtudiant {

    private final IServiceEtudiant iServiceEtudiant ;
    @GetMapping()
    List<Etudiant> retrieveAllEtudiants(){ return iServiceEtudiant.retrieveAllEtudiants();}

    @PostMapping()
    Etudiant addEtudiant(@RequestBody Etudiant etudiant){ return iServiceEtudiant.addEtudiant(etudiant);}

    @PutMapping()
    Etudiant updateEtudiant (@RequestBody Etudiant etudiant){ return iServiceEtudiant.updateEtudiant(etudiant);}

    @PutMapping("/{idEtudiant}/{idDepart}")
    void assignEtudiantToDepartement (@PathVariable("idEtudiant") Integer idEtudiant ,@PathVariable("idDepart") Integer idDepart){ iServiceEtudiant.assignEtudiantToDepartement(idEtudiant,idDepart);}
    @GetMapping("/{idEtudiant}")
    Etudiant retrieveEtudiant(@PathVariable("idEtudiant") Integer idEtudiant){ return iServiceEtudiant.retrieveEtudiant(idEtudiant);}
    @DeleteMapping("/{idEtudiant}")
    void removeEtudiant(@PathVariable("idEtudiant")Integer idEtudiant){ iServiceEtudiant.removeEtudiant(idEtudiant);}
    @PutMapping("/e/{idEquipe}/{idContart}")
    Etudiant addAndAssignEtudiantToEquipeAndContract (@RequestBody Etudiant etudiant ,@PathVariable("idEquipe") Integer idEquipe ,@PathVariable("idContart") Integer idContart){
        return iServiceEtudiant.addAndAssignEtudiantToEquipeAndContract(etudiant,idEquipe,idContart);
    }



}
