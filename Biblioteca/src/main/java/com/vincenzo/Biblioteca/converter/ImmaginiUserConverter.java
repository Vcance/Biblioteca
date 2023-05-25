package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.ImmaginiUserDto;
import com.vincenzo.Biblioteca.model.Immagini;
import com.vincenzo.Biblioteca.model.ImmaginiUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImmaginiUserConverter extends AbstractConverter<ImmaginiUser, ImmaginiUserDto> {
    @Autowired
    private ImmaginiConverter immaginiConverter;
//    @Autowired
//    private UtenteConverter utenteConverter;
@Autowired
private UtenteMapping utenteConverter;
    @Autowired
    private LibroMapping libroConverter;
    @Override
    public ImmaginiUser toEntity(ImmaginiUserDto immaginiUserDto) {
        ImmaginiUser immaginiUser=null;
        if(immaginiUserDto!=null){
            immaginiUser=new ImmaginiUser(immaginiUserDto.getId(),utenteConverter.toEntity(immaginiUserDto.getUtenteDto()),libroConverter.toEntity(immaginiUserDto.getLibroDto()),immaginiConverter.toEntity(immaginiUserDto.getImmaginiDto()));
        }
        return immaginiUser;
    }

    @Override
    public ImmaginiUserDto toDTO(ImmaginiUser immaginiUser) {
        ImmaginiUserDto immaginiUserDto=null;
        if(immaginiUser!=null){
            immaginiUserDto=new ImmaginiUserDto(immaginiUser.getId(),utenteConverter.toDTO(immaginiUser.getUtente()),libroConverter.toDTO(immaginiUser.getLibro()),immaginiConverter.toDTO(immaginiUser.getImmagini()));
        }
        return immaginiUserDto;
    }
}
