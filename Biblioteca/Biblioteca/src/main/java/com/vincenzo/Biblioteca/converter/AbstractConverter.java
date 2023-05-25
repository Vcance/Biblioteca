package com.vincenzo.Biblioteca.converter;

import com.vincenzo.Biblioteca.dto.PrestitiDto;
import com.vincenzo.Biblioteca.model.Prestiti;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<Entity,DTO> implements ConverterInterface<Entity,DTO> {

    @Override
    public List<DTO> toDTOList(List<Entity> list) {
        List<DTO> dtoList=new ArrayList<DTO>();
        if(list!=null){
            for (Entity lista:list) {
                DTO dto=toDTO(lista);
                dtoList.add(dto);
            }
        }
        return dtoList;
    }


    @Override
    public List<Entity> toEntityList(List<DTO> list) {
        List<Entity> entityList=new ArrayList<Entity>();
        for (DTO dto:list) {
            Entity entity=toEntity(dto);
            entityList.add(entity);

        }
        return entityList;
    }
}
