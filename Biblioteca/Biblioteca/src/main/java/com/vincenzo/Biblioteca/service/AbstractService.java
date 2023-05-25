package com.vincenzo.Biblioteca.service;

import com.vincenzo.Biblioteca.converter.ConverterInterface;
import com.vincenzo.Biblioteca.converter.UtenteConverter;
import com.vincenzo.Biblioteca.dao.UtenteRepository;
import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.model.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class AbstractService<Entity,DTO> implements ServiceInterface<DTO> {
    @Autowired
    private ConverterInterface<Entity,DTO> converterInterface;
    @Autowired
    private CrudRepository<Entity,Long> crudRepository;


    @Override
    public DTO read(Long id) {
        return converterInterface.toDTO(crudRepository.findById(id).get());

    }
    @Override
    public List<DTO> getall() {
        return converterInterface.toDTOList((List<Entity>) crudRepository.findAll());
    }

    @Override
    public DTO insert(DTO utenteDto) {
        return converterInterface.toDTO(crudRepository.save(converterInterface.toEntity(utenteDto)));
    }

    @Override
    public void delete(Long id) {
        crudRepository.deleteById(id);
    }

    @Override
    public DTO update(DTO utenteDto) {
        DTO dto=null;
        if(utenteDto!=null){
            dto=converterInterface.toDTO(crudRepository.save(converterInterface.toEntity(utenteDto)));
//            dto=converterInterface.toDTO(utenteRepository.save(utenteConverter.toEntity(utenteDto)));
        }
        return dto;
    }


}
