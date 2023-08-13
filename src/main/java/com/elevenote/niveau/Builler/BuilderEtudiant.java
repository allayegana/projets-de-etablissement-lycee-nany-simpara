package com.elevenote.niveau.Builler;


import com.elevenote.niveau.Entity.Etudiant;
import com.elevenote.niveau.Request.EtudiantRequest;
import com.elevenote.niveau.Response.EtudiantResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class BuilderEtudiant {
    public Etudiant buil(EtudiantRequest request) {

        return Etudiant
                .builder()
                //  .materiels(request.getMatiers().stream().map(Matiers::new).collect(Collectors.toList()))
                .nom(request.getNom())
                .DateNaissance(request.getDateNaissance())
                .nomFamille(request.getNomFamille())
                .trimestre(request.getTrimestre())
                .statusEleve(request.getStatus())
                .build();
    }


    public List<EtudiantResponse> build(List<Etudiant> etudiaList) {

        return etudiaList.stream().map(EtudiantResponse::new)
                .collect(Collectors.toList()
                );
    }
}
