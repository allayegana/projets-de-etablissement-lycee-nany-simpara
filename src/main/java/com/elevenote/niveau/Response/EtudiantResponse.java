package com.elevenote.niveau.Response;


import com.elevenote.niveau.Entity.Etudiant;
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
public class EtudiantResponse {

    private long id;
    private String nom;
    private String nomFamille;
    private String DateNaissance;
    private Boolean trimestre;
    private List<Matiers> materiels;
    private ClassementElevePourAnne statusEleve;

    public EtudiantResponse(Etudiant etudiant) {
        this.id = etudiant.getId();
        this.DateNaissance = etudiant.getDateNaissance();
        this.nom = etudiant.getNom();
        this.nomFamille = etudiant.getNomFamille();
        this.materiels = etudiant.getMateriels();
        this.statusEleve = etudiant.getStatusEleve();
        this.trimestre = etudiant.getTrimestre();

    }
}
