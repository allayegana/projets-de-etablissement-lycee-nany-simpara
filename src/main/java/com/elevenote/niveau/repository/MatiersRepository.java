package com.elevenote.niveau.repository;

import com.elevenote.niveau.Entity.Matiers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiersRepository extends JpaRepository<Matiers,Long> {
}