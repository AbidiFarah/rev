package com.example.revision.Controller;

import com.example.revision.Entity.Equipe;
import com.example.revision.Service.Equipe.IServiceEquipe;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/equipe")
public class ControllerEquipe {
    private final IServiceEquipe iServiceEquipe;
    @GetMapping()
    List<Equipe> retrieveAllEquipes(){ return iServiceEquipe.retrieveAllEquipes();}

    @PostMapping()
    Equipe addEquipe(@RequestBody Equipe equipe){ return iServiceEquipe.addEquipe(equipe);}

    @PutMapping()
    Equipe updateEquipe (@RequestBody Equipe equipe){ return iServiceEquipe.updateEquipe(equipe);}
    @GetMapping("/{idEquipe}")
    Equipe retrieveEquipe(@PathVariable("idEquipe") Integer idEquipe){ return iServiceEquipe.retrieveEquipe(idEquipe);}

}
