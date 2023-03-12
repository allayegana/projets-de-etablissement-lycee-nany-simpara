package Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Eleve")
@Entity
@Data
public class Materiel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
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
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private Etudiant etudiant;

}
