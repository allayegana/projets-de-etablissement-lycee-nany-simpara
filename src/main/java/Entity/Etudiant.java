package Entity;

import EnumStatus.ClassementElevePourAnne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
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
    private Long id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "NOM_FAMILLE")
    private String nomFamille;
    @Column(name = "DATE_NAISSANCE")
    private LocalDate DateNaissance;
    @Column(name = "TRIMESTRE")
    private Boolean trimestre;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materiels")
    private List<Materiel> materiels;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusEleve")
    private ClassementElevePourAnne statusEleve;

}
