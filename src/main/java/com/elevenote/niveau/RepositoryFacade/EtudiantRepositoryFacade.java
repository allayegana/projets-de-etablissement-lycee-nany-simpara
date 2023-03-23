package com.elevenote.niveau.RepositoryFacade;

import com.elevenote.niveau.Request.EtudiantRequest;
import com.elevenote.niveau.Request.MatiersRequest;

public interface EtudiantRepositoryFacade {

 //   List<EtudiantResponse> prendreLaListEleve();

   void sauvegarder(EtudiantRequest request);
}
