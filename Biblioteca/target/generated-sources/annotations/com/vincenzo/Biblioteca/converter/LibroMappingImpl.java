package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.LibroDto;
import com.vincenzo.Biblioteca.model.Libro;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-25T15:45:50+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class LibroMappingImpl implements LibroMapping {

    @Override
    public Libro toEntity(LibroDto dto) {
        if ( dto == null ) {
            return null;
        }

        Libro libro = new Libro();

        libro.setId( dto.getId() );
        libro.setNomelibro( dto.getNomelibro() );
        libro.setCodicelibro( dto.getCodicelibro() );
        libro.setAutore( dto.getAutore() );

        return libro;
    }

    @Override
    public LibroDto toDTO(Libro entity) {
        if ( entity == null ) {
            return null;
        }

        LibroDto libroDto = new LibroDto();

        libroDto.setId( entity.getId() );
        libroDto.setNomelibro( entity.getNomelibro() );
        libroDto.setCodicelibro( entity.getCodicelibro() );
        libroDto.setAutore( entity.getAutore() );

        return libroDto;
    }

    @Override
    public List<LibroDto> toDTOList(List<Libro> list) {
        if ( list == null ) {
            return null;
        }

        List<LibroDto> list1 = new ArrayList<LibroDto>( list.size() );
        for ( Libro libro : list ) {
            list1.add( toDTO( libro ) );
        }

        return list1;
    }

    @Override
    public List<Libro> toEntityList(List<LibroDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Libro> list1 = new ArrayList<Libro>( list.size() );
        for ( LibroDto libroDto : list ) {
            list1.add( toEntity( libroDto ) );
        }

        return list1;
    }
}
