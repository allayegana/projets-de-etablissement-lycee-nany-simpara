package com.elevenote.niveau.Http;

import com.elevenote.niveau.Request.EtudiantRequest;
import com.elevenote.niveau.Response.EtudiantResponse;
import com.elevenote.niveau.UseCase.EtudiantUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path="/etudiant")
public class EtudiantControllers {

    @Autowired
    private EtudiantUsecase etudiantUsecase;

    @GetMapping(path = "getEleve", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<EtudiantResponse> getEtudiant(){
        return etudiantUsecase.getEtudiant();
    }

    /**
     * @param request
     */
    @PostMapping(path = "/cadastrement", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrement(@Valid @RequestBody EtudiantRequest request) {
        etudiantUsecase.cadastrement(request);
    }
}
