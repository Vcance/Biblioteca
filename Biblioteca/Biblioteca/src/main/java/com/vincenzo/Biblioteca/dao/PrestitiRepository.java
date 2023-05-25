package com.vincenzo.Biblioteca.dao;

import com.vincenzo.Biblioteca.dto.LibroDto;
import com.vincenzo.Biblioteca.model.Libro;
import com.vincenzo.Biblioteca.model.Prestiti;
import com.vincenzo.Biblioteca.model.Utente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Repository
@Transactional
public interface PrestitiRepository extends CrudRepository<Prestiti,Long> {
    List<Prestiti> findAllByDatarestituizione (LocalDate localDate);
    List<Prestiti> findAllByDataprestito (LocalDate localDate);
    Prestiti findByUtente(Utente utente);
    List<Prestiti> findAllByUtente(Utente utente);
    List<Prestiti> findAllByLibro(Libro libro);

}
