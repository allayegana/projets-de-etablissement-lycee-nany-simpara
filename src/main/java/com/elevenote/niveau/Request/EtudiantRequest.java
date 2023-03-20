package com.elevenote.niveau.Request;

import com.elevenote.niveau.Entity.Materiel;
import com.elevenote.niveau.EnumStatus.ClassementElevePourAnne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class EtudiantRequest {

    private String nom;
    private String nomFamille;
    private String DateNaissance;
    private Boolean trimestre;
    private List<Materiel> materiels;
    private ClassementElevePourAnne status;

}
