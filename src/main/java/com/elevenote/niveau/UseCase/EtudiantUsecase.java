package com.elevenote.niveau.UseCase;

import com.elevenote.niveau.RepositoryFacade.EtudiantRepositoryFacade;
import com.elevenote.niveau.Request.EtudiantRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        facade.sauvegarder(request);
    }
}
