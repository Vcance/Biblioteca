package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.LibroDto;
import com.vincenzo.Biblioteca.model.Libro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LibroMapping extends ConverterInterface<Libro, LibroDto> {

}
