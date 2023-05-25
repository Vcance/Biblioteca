package com.vincenzo.Biblioteca.controller;

import com.vincenzo.Biblioteca.dto.ImmaginiUserDto;
import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.model.ImmaginiUser;
import com.vincenzo.Biblioteca.service.ImmaginiUserService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("/http://localhost:4200")
@RequestMapping("/immaginiuser")
public class ImmaginiUserController extends AbstractController<ImmaginiUserDto>{
    @Autowired
    private ImmaginiUserService immaginiUserService;
    @PostMapping("/immaginiuser")
    public ResponseEntity<List<ImmaginiUserDto>> immaginiUser(UtenteDto utenteDto){
        List<ImmaginiUserDto> immaginiUserList=immaginiUserService.immaginiuser(utenteDto);
        if(immaginiUserList!=null){
            return new ResponseEntity<>(immaginiUserList, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
}
