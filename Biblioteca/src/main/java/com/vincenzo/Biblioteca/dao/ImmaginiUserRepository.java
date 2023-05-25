package com.vincenzo.Biblioteca.dao;

import com.vincenzo.Biblioteca.dto.ImmaginiUserDto;
import com.vincenzo.Biblioteca.model.Immagini;
import com.vincenzo.Biblioteca.model.ImmaginiUser;
import com.vincenzo.Biblioteca.model.Utente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface ImmaginiUserRepository extends CrudRepository<ImmaginiUser,Long> {
    List<ImmaginiUser> findAllByImmagini(Utente utente);
}
