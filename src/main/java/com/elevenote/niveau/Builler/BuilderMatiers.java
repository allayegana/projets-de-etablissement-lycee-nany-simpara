package com.elevenote.niveau.Builler;


import com.elevenote.niveau.Entity.Matiers;
import com.elevenote.niveau.Request.MatiersRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BuilderMatiers {
    public Matiers buil(MatiersRequest request) {

        return Matiers
                .builder()
             //   .id(request.getEtudiant().getId())
                .math(request.getMath())
                .ecm(request.getEcm())
                .anglais(request.getAnglais())
                .sport(request.getSport())
                .chimie(request.getChimie())
                .phisique(request.getPhisique())
                .langueChoisi(request.getLangueChoisi())
                .histoire(request.getHistoire())
                .geographie(request.getGeographie())
                .build();
    }
}
