package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.PrestitiDto;
import com.vincenzo.Biblioteca.model.Prestiti;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-25T15:50:25+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class PrestitiMappingImpl implements PrestitiMapping {

    @Override
    public Prestiti toEntity(PrestitiDto dto) {
        if ( dto == null ) {
            return null;
        }

        Prestiti prestiti = new Prestiti();

        prestiti.setId( dto.getId() );
        prestiti.setDataprestito( dto.getDataprestito() );
        prestiti.setDatarestituizione( dto.getDatarestituizione() );

        return prestiti;
    }

    @Override
    public PrestitiDto toDTO(Prestiti entity) {
        if ( entity == null ) {
            return null;
        }

        PrestitiDto prestitiDto = new PrestitiDto();

        prestitiDto.setId( entity.getId() );
        prestitiDto.setDataprestito( entity.getDataprestito() );
        prestitiDto.setDatarestituizione( entity.getDatarestituizione() );

        return prestitiDto;
    }

    @Override
    public List<PrestitiDto> toDTOList(List<Prestiti> list) {
        if ( list == null ) {
            return null;
        }

        List<PrestitiDto> list1 = new ArrayList<PrestitiDto>( list.size() );
        for ( Prestiti prestiti : list ) {
            list1.add( toDTO( prestiti ) );
        }

        return list1;
    }

    @Override
    public List<Prestiti> toEntityList(List<PrestitiDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Prestiti> list1 = new ArrayList<Prestiti>( list.size() );
        for ( PrestitiDto prestitiDto : list ) {
            list1.add( toEntity( prestitiDto ) );
        }

        return list1;
    }
}
