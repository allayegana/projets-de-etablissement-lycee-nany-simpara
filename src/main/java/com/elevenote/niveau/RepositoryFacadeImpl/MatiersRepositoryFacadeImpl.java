package com.elevenote.niveau.RepositoryFacadeImpl;

import com.elevenote.niveau.Builler.BuilderMatiers;
import com.elevenote.niveau.Entity.Matiers;
import com.elevenote.niveau.RepositoryFacade.MatiersRepositoryFacade;
import com.elevenote.niveau.Request.MatiersRequest;
import com.elevenote.niveau.repository.EtudiantRepository;
import com.elevenote.niveau.repository.MatiersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatiersRepositoryFacadeImpl implements MatiersRepositoryFacade {

    @Autowired
    private MatiersRepository repository;

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private BuilderMatiers builderMatiers;
//    @Override
//    public List<EtudiantResponse> prendreLaListEleve() {
//        return repository.findAll();
//    }

    @Override
    public void sauvegarder(MatiersRequest request) {
       var etudiant =  etudiantRepository.findById(request.getEtudiant().getId());
        Matiers entity = builderMatiers.buil(request);
        entity.setEtudiant(etudiant.get());
        repository.save(entity);
    }
}
