package com.vincenzo.Biblioteca.controller;

import com.vincenzo.Biblioteca.dto.UtenteDto;
import com.vincenzo.Biblioteca.service.ServiceInterface;
import com.vincenzo.Biblioteca.service.UtenteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractController<DTO> {
    @Autowired
    private ServiceInterface<DTO> serviceInterface;

    @GetMapping("/getall")
    public List<DTO> getall(){
        List<DTO> list=serviceInterface.getall();
        System.out.println();
        return list;

    }

    @PostMapping("/insert")
    public DTO insert(@RequestBody DTO utenteDto){
        return serviceInterface.insert(utenteDto);
    }

    @PostMapping("/read")
    public DTO read(@RequestParam Long id){
        return  serviceInterface.read(id);
    }

    @DeleteMapping("/delete")
    public String delete(Long id){
        serviceInterface.delete(id);
        return "eliminato";
    }
    @PostMapping("/update")
    public DTO update(@RequestBody DTO utenteDto){
       return  serviceInterface.update(utenteDto);

    }
}
