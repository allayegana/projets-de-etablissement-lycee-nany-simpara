package com.elevenote.niveau.repository;

import com.elevenote.niveau.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    List<Etudiant> findByid(Long id);
}
