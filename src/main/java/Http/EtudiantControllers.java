package Http;


import Request.EtudiantRequest;
import UseCase.EtudiantUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path="/etudiant")
public class EtudiantControllers {

    @Autowired
    private EtudiantUsecase etudiantUsecase;

    public EtudiantControllers(EtudiantUsecase etudiantUsecase) {
        this.etudiantUsecase = etudiantUsecase;
    }
//    @GetMapping(path = "getEleve", produces = APPLICATION_JSON_VALUE)
//    @ResponseStatus(HttpStatus.OK)
//    public List<EtudiantResponse> getEtudiant(){
//        return etudiantUsecase.getEtudiant();
//    }

    /**
     * @param request
     */
    @PostMapping(path="cadastrement", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrement(@Valid  EtudiantRequest request) {
        etudiantUsecase.cadastrement(request);
    }
}
