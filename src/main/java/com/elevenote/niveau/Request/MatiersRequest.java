package com.elevenote.niveau.Request;

import com.elevenote.niveau.Entity.Etudiant;
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
    private Etudiant etudiant;
}
