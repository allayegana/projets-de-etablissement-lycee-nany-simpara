package com.elevenote.niveau.RepositoryFacadeImpl;

import com.elevenote.niveau.Builler.BuilderEtudiant;
import com.elevenote.niveau.Entity.Etudiant;
import com.elevenote.niveau.RepositoryFacade.EtudiantRepositoryFacade;
import com.elevenote.niveau.Request.EtudiantRequest;
import com.elevenote.niveau.repository.EtudiantRepository;
import com.elevenote.niveau.repository.MatiersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class EtudiantRepositoryFacadeImpl implements EtudiantRepositoryFacade {

    @Autowired
    private EtudiantRepository repository;

    @Autowired
    private MatiersRepository matiersRepository;
    @Autowired
    private BuilderEtudiant builderEtudiant;
//    @Override
//    public List<EtudiantResponse> prendreLaListEleve() {
//        return repository.findAll();
//    }

    @Override
    public void sauvegarder(EtudiantRequest request) {
        Etudiant entity = builderEtudiant.buil(request);
        request.getMatiers().forEach(x -> x.setEtudiant(entity));
        entity.setMateriels(request.getMatiers());
        repository.save(entity);
       // matiersRepository.saveAll(request.getMatiers());
    }
}
