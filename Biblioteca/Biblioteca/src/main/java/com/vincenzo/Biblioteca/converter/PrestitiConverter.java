package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.PrestitiDto;
import com.vincenzo.Biblioteca.model.Prestiti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class PrestitiConverter extends AbstractConverter<Prestiti, PrestitiDto> {
//    @Autowired
//    private UtenteConverter utenteConverter;
@Autowired
private UtenteMapping utenteConverter;
    @Autowired
    private LibroMapping libroConverter;
    @Override
    public Prestiti toEntity(PrestitiDto prestitiDto) {
        Prestiti prestiti=null;
        if(prestitiDto!=null){
            prestiti=new Prestiti(prestitiDto.getId(),prestitiDto.getDataprestito(),prestitiDto.getDatarestituizione(),
                    libroConverter.toEntity(prestitiDto.getLibroDto()),utenteConverter.toEntity(prestitiDto.getUtenteDto()));
        }
        return prestiti;
    }

    @Override
    public PrestitiDto toDTO(Prestiti prestiti) {
        PrestitiDto prestitiDto=null;
        if(prestiti!=null){
            prestitiDto=new PrestitiDto(prestiti.getId(),prestiti.getDataprestito(),prestiti.getDatarestituizione(),utenteConverter.toDTO(prestiti.getUtente()),
                    libroConverter.toDTO(prestiti.getLibro()));
        }
        return prestitiDto;
    }

}
