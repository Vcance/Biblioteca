package com.vincenzo.Biblioteca.dao;

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
public interface UtenteRepository extends CrudRepository<Utente,Long> {
    public Utente findByNomeAndCognome(String nome, String cognome);

}
