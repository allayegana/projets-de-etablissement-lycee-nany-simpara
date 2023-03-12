package Builler;


import Entity.Etudiant;
import Request.EtudiantRequest;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BuilderEtudiant {
    public Etudiant buil(EtudiantRequest request) {

        return Etudiant
                .builder()
                .nom(request.getNom())
                .DateNaissance(request.getDateNaissance())
                .nomFamille(request.getNomFamille())
                .trimestre(request.getTrimestre())
                .materiels(request.getMateriels())
                .statusEleve(request.getStatus())
                .build();
    }
}
