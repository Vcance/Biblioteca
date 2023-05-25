package com.vincenzo.Biblioteca.service;

import com.vincenzo.Biblioteca.converter.UtenteConverter;
import com.vincenzo.Biblioteca.converter.UtenteMapping;
import com.vincenzo.Biblioteca.dao.UtenteRepository;
import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.model.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UtenteService extends AbstractService<Utente,UtenteDto> {
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private UtenteMapping utenteConverter;

    public UtenteDto read_nome_cognome(String nome,String cognome) {
        Utente utente = null;
        UtenteDto utenteDto1 = null;
        if (nome != null && cognome != null) {
            utente = utenteRepository.findByNomeAndCognome(nome, cognome);
            utenteDto1 = utenteConverter.toDTO(utente);

        }
        return utenteDto1;

    }
}
