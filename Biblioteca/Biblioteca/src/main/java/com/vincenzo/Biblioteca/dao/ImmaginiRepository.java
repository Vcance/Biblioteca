package com.vincenzo.Biblioteca.dao;

import com.vincenzo.Biblioteca.model.Immagini;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ImmaginiRepository extends JpaRepository<Immagini,Long> {
}
