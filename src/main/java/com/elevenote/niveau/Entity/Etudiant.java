package com.elevenote.niveau.Entity;

import com.elevenote.niveau.EnumStatus.ClassementElevePourAnne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Eleve")
@Entity
@Data
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "NOM_FAMILLE")
    private String nomFamille;
    @Column(name = "DATE_NAISSANCE")
    private String DateNaissance;
    @Column(name = "TRIMESTRE")
    private Boolean trimestre;

//    @ManyToOne( fetch = FetchType.LAZY)
//    @JoinColumn( name= "MATIERS_ID",nullable = false )
//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinTable(name="matiers",
//            joinColumns={@JoinColumn(name="matiers_id",
//                    referencedColumnName="ID")})
  //  @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")



    @OneToMany(fetch = FetchType.LAZY, mappedBy = "etudiant", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Matiers> materiels = new ArrayList<>();
    @JoinColumn(name = "statusEleve")
    @Enumerated(EnumType.STRING)
    private ClassementElevePourAnne statusEleve;

}
