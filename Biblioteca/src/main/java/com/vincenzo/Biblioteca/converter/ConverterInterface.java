package com.vincenzo.Biblioteca.converter;

import org.springframework.stereotype.Component;

import java.util.List;

public interface ConverterInterface<Entity,DTO>{
    public Entity toEntity(DTO dto);
    public DTO toDTO(Entity entity);
    public List<DTO> toDTOList(List<Entity> list);
    public List<Entity> toEntityList(List<DTO>list);
}
