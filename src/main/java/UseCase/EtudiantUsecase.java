package UseCase;

import RepositoryFacade.EtudiantRepositoryFacade;
import Request.EtudiantRequest;
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
