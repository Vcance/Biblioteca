package com.vincenzo.Biblioteca.service;

import com.vincenzo.Biblioteca.converter.*;
import com.vincenzo.Biblioteca.dao.PrestitiRepository;
import com.vincenzo.Biblioteca.dto.LibroDto;
import com.vincenzo.Biblioteca.dto.PrestitiDto;
import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.model.Libro;
import com.vincenzo.Biblioteca.model.Prestiti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PrestitiService extends AbstractService<Prestiti, PrestitiDto>{
    @Autowired
    private PrestitiMapping prestitiConverter;
    @Autowired
    private PrestitiRepository prestitiRepository;
//    @Autowired
//    private UtenteConverter utenteConverter;
    @Autowired
    private UtenteMapping utenteConverter;
    @Autowired
    private LibroMapping libroConverter;

    @Override
    public PrestitiDto insert(PrestitiDto prestitiDto){
        if(prestitiDto!=null){
            prestitiDto.setDatarestituizione(prestitiDto.getDataprestito().plusMonths(1));
        }
        return prestitiConverter.toDTO(prestitiRepository.save(prestitiConverter.toEntity(prestitiDto)));
    }
    public List<PrestitiDto> getall_data_rest(LocalDate date_rest){
        List<PrestitiDto> list=new ArrayList<PrestitiDto>();
        if(date_rest!=null){

            list=prestitiConverter.toDTOList( prestitiRepository.findAllByDataprestito(date_rest));
        }
        return list;

    }
    public List<PrestitiDto> getall_data_prest(LocalDate date_prest){
        List<PrestitiDto> list=new ArrayList<PrestitiDto>();
        if(date_prest!=null){

            list=prestitiConverter.toDTOList( prestitiRepository.findAllByDatarestituizione(date_prest));
        }
        return list;

    }

    public List<PrestitiDto> read_libro_utente( UtenteDto utenteDto){
        List<PrestitiDto> list=new ArrayList<>();
        if(utenteDto!=null){
            list=prestitiConverter.toDTOList(prestitiRepository.findAllByUtente(utenteConverter.toEntity(utenteDto)));
        }
        return list;

    }
    public List<PrestitiDto> read_libro( LibroDto libroDto){
        List<PrestitiDto> list=new ArrayList<>();
        if(libroDto!=null){
            list=prestitiConverter.toDTOList(prestitiRepository.findAllByLibro(libroConverter.toEntity(libroDto)));
        }
        return list;

    }
}
