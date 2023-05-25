package com.vincenzo.Biblioteca.controller;

import com.vincenzo.Biblioteca.dto.ImmaginiDto;
import com.vincenzo.Biblioteca.service.ImmaginiService;
import com.vincenzo.Biblioteca.service.ImmaginiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "/http://localhost:4200")
@RequestMapping("/immagini")
public class ImmaginiController extends AbstractController<ImmaginiDto> {

}
