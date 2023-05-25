package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.LibroDto;
import com.vincenzo.Biblioteca.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class LibroConverter extends AbstractConverter<Libro, LibroDto> {


    @Override
    public Libro toEntity(LibroDto libroDto) {
        Libro libro=null;
        if(libroDto!=null){
            libro=new Libro(libroDto.getId(),libroDto.getNomelibro(),libroDto.getCodicelibro(),libroDto.getAutore());
        }
        return libro;
    }

    @Override
    public LibroDto toDTO(Libro libro) {
        LibroDto libroDto=null;
        if(libro!=null){
            libroDto=new LibroDto(libro.getId(),libro.getCodicelibro(),libro.getNomelibro(),libro.getAutore());
        }
        return libroDto;
    }
}
