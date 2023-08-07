package com.elevenote.niveau.UseCase;

import com.elevenote.niveau.Entity.Matiers;
import com.elevenote.niveau.EnumStatus.ClassementElevePourAnne;
import com.elevenote.niveau.RepositoryFacade.EtudiantRepositoryFacade;
import com.elevenote.niveau.Request.EtudiantRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EtudiantUsecase {

    @Autowired
    private EtudiantRepositoryFacade facade;


    public EtudiantUsecase(EtudiantRepositoryFacade facade) {
        this.facade = facade;
    }
//    public List<EtudiantResponse> getEtudiant() {
//
//
//
//        return response;
//    }

    public void cadastrement(EtudiantRequest request) {
       var resultat = request.getMatiers().stream().map(Matiers::new).collect(Collectors.toList());
        validationEleve(request, resultat);
        facade.sauvegarder(request);
    }



    private static void validationEleve(EtudiantRequest request, List<Matiers> resultat) {
        for (Matiers matiers : resultat) {
            double resultat2 = matiers.getChimie() + matiers.getSport() + matiers.getPhisique() + matiers.getMath() + matiers.getGeographie() +
                    matiers.getAnglais() + matiers.getHistoire() + matiers.getEcm() + matiers.getLangueChoisi();
            double resultat3 = resultat2 / 9;

            System.out.println(resultat3);
            if (resultat3 >= 15){
                request.setStatus(ClassementElevePourAnne.EXCELLENT);
            } else if (resultat3 > 13 && resultat3 <= 14) {
                request.setStatus(ClassementElevePourAnne.BIEN);
            }else if (resultat3 > 10 && resultat3 <= 13) {
                    request.setStatus(ClassementElevePourAnne.PASSABLE);
                }else {
                request.setStatus(ClassementElevePourAnne.MEDIOCRE);
            }
        }
    }


}
