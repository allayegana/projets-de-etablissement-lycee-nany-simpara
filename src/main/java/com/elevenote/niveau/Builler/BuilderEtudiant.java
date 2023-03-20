package com.elevenote.niveau.Builler;


import com.elevenote.niveau.Entity.Etudiant;
import com.elevenote.niveau.Entity.Materiel;
import com.elevenote.niveau.Request.EtudiantRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Slf4j
@Service
public class BuilderEtudiant {
    public Etudiant buil(EtudiantRequest request) {

        return Etudiant
                .builder()
                .nom(request.getNom())
                .DateNaissance(request.getDateNaissance())
                .nomFamille(request.getNomFamille())
                .trimestre(request.getTrimestre())
                .materiels(request.getMateriels().stream().map(Materiel::new).collect(Collectors.toList()))
                .statusEleve(request.getStatus())
                .build();
    }
}
