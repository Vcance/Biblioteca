package com.vincenzo.Biblioteca.controller;

import com.vincenzo.Biblioteca.dto.LibroDto;
import com.vincenzo.Biblioteca.dto.PrestitiDto;
import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.model.Libro;
import com.vincenzo.Biblioteca.model.Prestiti;
import com.vincenzo.Biblioteca.service.PrestitiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/prestiti")
public class PrestitiController extends AbstractController<PrestitiDto> {
    @Autowired
    private PrestitiService prestitiService;
    @PostMapping("/getall_data_rest")
    public ResponseEntity<List<PrestitiDto>> getall_data_rest(@RequestParam LocalDate date_rest){
        List<PrestitiDto> list=prestitiService.getall_data_rest(date_rest);
        if(list!=null) {

            return new ResponseEntity<List<PrestitiDto>>(list,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
    @PostMapping("/getall_data_prest")
    public ResponseEntity<List<PrestitiDto>> getall_data_prest(@RequestParam LocalDate date_prest){
        List<PrestitiDto> list=prestitiService.getall_data_prest(date_prest);
        if(list!=null) {

            return new ResponseEntity<List<PrestitiDto>>(list,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
@PostMapping("/read_libro_utente")
    public ResponseEntity<List<PrestitiDto>> read_libro_utente(@RequestBody UtenteDto utenteDto){
        List<PrestitiDto> list=prestitiService.read_libro_utente(utenteDto);
        if(list!=null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
    @PostMapping("/read_libro")
    public ResponseEntity<List<PrestitiDto>> read_libro(@RequestBody LibroDto libroDto){
        List<PrestitiDto> prestitiDtoList=prestitiService.read_libro(libroDto);
        if(prestitiDtoList!=null){
            return new ResponseEntity<>(prestitiDtoList,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
}
