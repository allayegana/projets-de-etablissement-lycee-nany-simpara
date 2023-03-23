package com.elevenote.niveau.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class EtudiantRequest {

    private String nom;
    private String nomFamille;
    private String DateNaissance;
    private Boolean trimestre;

}
