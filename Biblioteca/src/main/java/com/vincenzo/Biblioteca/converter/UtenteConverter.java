package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.model.Utente;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class UtenteConverter extends AbstractConverter<Utente,UtenteDto> {

    @Override
    public Utente toEntity(UtenteDto utenteDto) {
        Utente utente=null;
        if(utenteDto!=null){
            utente=new Utente(utenteDto.getId(), utenteDto.getNome(), utenteDto.getCognome(), utenteDto.getIndirizzo());
        }
        return utente;
    }

    @Override
    public UtenteDto toDTO(Utente utente) {
        UtenteDto utenteDto=null;
        if(utente!=null){
            utenteDto=new UtenteDto(utente.getId(), utente.getNome(), utente.getCognome(), utente.getIndirizzo());
        }
        return utenteDto;
    }




}
