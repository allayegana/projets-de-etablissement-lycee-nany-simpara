package com.elevenote.niveau.Request;

import com.elevenote.niveau.Entity.Etudiant;
import com.elevenote.niveau.Entity.Matiers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MatiersRequest {

    private Double math;
    private Double phisique;
    private Double chimie;
    private Double histoire;
    private Double geographie;
    private Double sport;
    private Double anglais;
    private Double langueChoisi;
    private Double ecm;
   // private Etudiant etudiant;

//    public MatiersRequest(Matiers matiers) {
//        this.anglais = matiers.getAnglais();
//        this.ecm = matiers.getEcm();
//        this.chimie = matiers.getChimie();
//        this.geographie = matiers.getGeographie();
//        this.histoire = matiers.getHistoire();
//        this.langueChoisi = matiers.getLangueChoisi();
//        this.math = matiers.getMath();
//        this.phisique = matiers.getPhisique();
//        this.sport =matiers.getSport();
//    }
}
