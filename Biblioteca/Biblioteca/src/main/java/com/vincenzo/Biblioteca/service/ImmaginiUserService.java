package com.vincenzo.Biblioteca.service;

import com.vincenzo.Biblioteca.converter.ImmaginiConverter;
import com.vincenzo.Biblioteca.converter.ImmaginiUserConverter;
import com.vincenzo.Biblioteca.converter.UtenteConverter;
import com.vincenzo.Biblioteca.converter.UtenteMapping;
import com.vincenzo.Biblioteca.dao.ImmaginiUserRepository;
import com.vincenzo.Biblioteca.dto.ImmaginiUserDto;
import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.model.Immagini;
import com.vincenzo.Biblioteca.model.ImmaginiUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImmaginiUserService extends AbstractService<ImmaginiUser, ImmaginiUserDto> {
    @Autowired
    private ImmaginiUserRepository immaginiUserRepository;
    @Autowired
    private ImmaginiUserConverter immaginiUserConverter;
//    @Autowired
//    private UtenteConverter utenteConverter;
@Autowired
private UtenteMapping utenteConverter;

    public List<ImmaginiUserDto> immaginiuser(UtenteDto utenteDto) {
        List<ImmaginiUserDto> immaginiUserList=null;
        if(utenteDto!=null){
            immaginiUserList=immaginiUserConverter.toDTOList(immaginiUserRepository.findAllByImmagini(utenteConverter.toEntity(utenteDto)));
        }
        return immaginiUserList;
    }
}
