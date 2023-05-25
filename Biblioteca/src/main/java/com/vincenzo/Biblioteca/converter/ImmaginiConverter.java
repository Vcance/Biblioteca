package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.ImmaginiDto;
import com.vincenzo.Biblioteca.dto.LibroDto;
import com.vincenzo.Biblioteca.model.Immagini;
import org.springframework.stereotype.Component;

@Component
public class ImmaginiConverter extends AbstractConverter<Immagini, ImmaginiDto> {
    @Override
    public Immagini toEntity(ImmaginiDto immaginiDto) {
        Immagini immagini=null;
        if(immaginiDto!=null){
            immagini=new Immagini(immaginiDto.getId(),immaginiDto.getUrl(),immaginiDto.getNome());
        }
        return immagini;
    }

    @Override
    public ImmaginiDto toDTO(Immagini immagini) {
        ImmaginiDto immaginiDto=null;
        if(immagini!=null){
            immaginiDto=new ImmaginiDto(immagini.getId(),immagini.getUrl(),immagini.getNome());
        }
        return immaginiDto;
    }
}
