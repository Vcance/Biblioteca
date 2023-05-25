package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.model.Utente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-25T11:46:02+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class UtenteMappingImpl implements UtenteMapping {

    @Override
    public Utente toEntity(UtenteDto dto) {
        if ( dto == null ) {
            return null;
        }

        Utente utente = new Utente();

        utente.setId( dto.getId() );
        utente.setNome( dto.getNome() );
        utente.setCognome( dto.getCognome() );
        utente.setIndirizzo( dto.getIndirizzo() );

        return utente;
    }

    @Override
    public UtenteDto toDTO(Utente entity) {
        if ( entity == null ) {
            return null;
        }

        UtenteDto utenteDto = new UtenteDto();

        utenteDto.setId( entity.getId() );
        utenteDto.setNome( entity.getNome() );
        utenteDto.setCognome( entity.getCognome() );
        utenteDto.setIndirizzo( entity.getIndirizzo() );

        return utenteDto;
    }

    @Override
    public List<UtenteDto> toDTOList(List<Utente> list) {
        if ( list == null ) {
            return null;
        }

        List<UtenteDto> list1 = new ArrayList<UtenteDto>( list.size() );
        for ( Utente utente : list ) {
            list1.add( toDTO( utente ) );
        }

        return list1;
    }

    @Override
    public List<Utente> toEntityList(List<UtenteDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Utente> list1 = new ArrayList<Utente>( list.size() );
        for ( UtenteDto utenteDto : list ) {
            list1.add( toEntity( utenteDto ) );
        }

        return list1;
    }
}
