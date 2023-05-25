package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.PrestitiDto;
import com.vincenzo.Biblioteca.model.Prestiti;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PrestitiMapping extends ConverterInterface<Prestiti, PrestitiDto> {
}
