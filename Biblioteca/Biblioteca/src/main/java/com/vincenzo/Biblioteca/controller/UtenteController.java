package com.vincenzo.Biblioteca.controller;

import com.vincenzo.Biblioteca.converter.UtenteConverter;
import com.vincenzo.Biblioteca.dao.UtenteRepository;
import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.model.Utente;
import com.vincenzo.Biblioteca.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/utente")
public class UtenteController extends AbstractController<UtenteDto> {
    @Autowired
    private UtenteService utenteService;

    @PostMapping("/read_nome_cognome")
    public ResponseEntity<UtenteDto> read_nome_cognome(@RequestParam String nome, String cognome){
        if(utenteService.read_nome_cognome(nome,cognome)==null){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<>(HttpStatus.OK);

    }


}
