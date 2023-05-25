package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.model.Utente;
import jakarta.persistence.Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UtenteMapping extends ConverterInterface<Utente,UtenteDto>{

}
