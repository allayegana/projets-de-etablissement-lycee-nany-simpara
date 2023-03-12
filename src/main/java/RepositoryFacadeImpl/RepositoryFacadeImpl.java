package RepositoryFacadeImpl;

import Builler.BuilderEtudiant;
import Entity.Etudiant;
import RepositoryFacade.EtudiantRepositoryFacade;
import Request.EtudiantRequest;
import Response.EtudiantResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EtudiantRepository;

import java.util.List;
@Service
public class RepositoryFacadeImpl implements EtudiantRepositoryFacade {

    @Autowired
    private EtudiantRepository repository;
    @Autowired
    private BuilderEtudiant builderEtudiant;
//    @Override
//    public List<EtudiantResponse> prendreLaListEleve() {
//        return repository.findAll();
//    }

    @Override
    public void sauvegarder(EtudiantRequest request) {
        Etudiant entity = builderEtudiant.buil(request);
        repository.save(entity);
    }
}
