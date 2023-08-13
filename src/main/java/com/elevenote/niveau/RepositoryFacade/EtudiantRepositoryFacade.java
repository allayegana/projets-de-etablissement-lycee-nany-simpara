package com.elevenote.niveau.RepositoryFacade;

import com.elevenote.niveau.Entity.Etudiant;
import com.elevenote.niveau.Request.EtudiantRequest;
import com.elevenote.niveau.Request.MatiersRequest;
import com.elevenote.niveau.Response.EtudiantResponse;

import java.util.List;

public interface EtudiantRepositoryFacade {

    List<EtudiantResponse> prendreLaListEleve();

   void sauvegarder(EtudiantRequest request);
}
