package com.vincenzo.Biblioteca.dao;

import com.vincenzo.Biblioteca.model.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface LibroRepository extends CrudRepository<Libro,Long> {
    public List<Libro> findByAutore(String autore);

}
