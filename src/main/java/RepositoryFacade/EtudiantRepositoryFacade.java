package RepositoryFacade;

import Request.EtudiantRequest;
import Response.EtudiantResponse;

import java.util.List;

public interface EtudiantRepositoryFacade {

 //   List<EtudiantResponse> prendreLaListEleve();

   void sauvegarder(EtudiantRequest request);
}
