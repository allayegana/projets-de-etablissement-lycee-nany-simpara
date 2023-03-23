package com.elevenote.niveau.Http;

import com.elevenote.niveau.Request.MatiersRequest;
import com.elevenote.niveau.UseCase.MatiersUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(path = "/matiers")
public class MatiersControllers {


    @Autowired
    private MatiersUsecase matiersUseCase;

//    @GetMapping(path = "getEleve", produces = APPLICATION_JSON_VALUE)
//    @ResponseStatus(HttpStatus.OK)
//    public List<EtudiantResponse> getEtudiant(){
//        return etudiantUsecase.getEtudiant();
//    }

    /**
     * @param request
     */
    @PostMapping(path = "/cadastrement", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrement(@Valid @RequestBody MatiersRequest request) {
        matiersUseCase.cadastrement(request);
    }
}


