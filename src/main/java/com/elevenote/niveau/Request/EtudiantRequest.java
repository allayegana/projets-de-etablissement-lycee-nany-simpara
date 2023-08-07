package com.elevenote.niveau.Request;

import com.elevenote.niveau.Entity.Matiers;
import com.elevenote.niveau.EnumStatus.ClassementElevePourAnne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private List<Matiers> matiers;
    private ClassementElevePourAnne status;
}
