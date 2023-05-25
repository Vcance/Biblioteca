package com.vincenzo.Biblioteca.controller;

import com.vincenzo.Biblioteca.dto.LibroDto;
import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.model.Libro;
import com.vincenzo.Biblioteca.model.Prestiti;
import com.vincenzo.Biblioteca.model.Utente;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost4200")
@RequestMapping("/libro")
public class LibroController extends AbstractController<LibroDto>{

}
