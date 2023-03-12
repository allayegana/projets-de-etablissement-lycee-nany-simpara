package Request;

import Entity.Materiel;
import EnumStatus.ClassementElevePourAnne;
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
    private LocalDate DateNaissance;
    private Boolean trimestre;
    private List<Materiel> materiels;
    private ClassementElevePourAnne status;

}
