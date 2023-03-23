package com.elevenote.niveau.UseCase;

import com.elevenote.niveau.RepositoryFacade.MatiersRepositoryFacade;
import com.elevenote.niveau.Request.MatiersRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatiersUsecase {

    @Autowired
    private MatiersRepositoryFacade facade;

//    public List<EtudiantResponse> getEtudiant() {
//
//
//
//        return response;
//    }

    public void cadastrement(MatiersRequest request) {
        facade.sauvegarder(request);
    }
}
