package com.elevenote.niveau.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Matiers")
@Entity
@Data
public class Matiers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "MATH")
    private Double math;
    @Column(name = "PHYSIQUE")
    private Double phisique;
    @Column(name = "CHIMIE")
    private Double chimie;
    @Column(name = "HISTOIRE")
    private Double histoire;
    @Column(name = "GEOGRAPHIE")
    private Double geographie;
    @Column(name = "SPORT")
    private Double sport;
    @Column(name = "ANGLAIS")
    private Double anglais;
    @Column(name = "LANGUE")
    private Double langueChoisi;
    @Column(name = "ECM")
    private Double ecm;

   //@OneToMany(fetch = FetchType.LAZY ,mappedBy  = "materiels")
 // @ManyToOne
//  @JoinColumn(name = "eleve_id")
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "ID_MATIERS")
    private Etudiant etudiant;

    public Matiers(Matiers matiers) {
        this.id = matiers.getId();
        this.anglais = matiers.getAnglais();
        this.ecm = matiers.getEcm();
        this.chimie = matiers.getChimie();
        this.histoire = matiers.getHistoire();
        this.geographie = matiers.getGeographie();
        this.math = matiers.getMath();
        this.phisique = matiers.getPhisique();
        this.sport = matiers.getSport();
        this.langueChoisi = matiers.getLangueChoisi();
        this.etudiant = matiers.getEtudiant();
    }
}
