package com.vincenzo.Biblioteca.dto;

import com.vincenzo.Biblioteca.model.Libro;
import com.vincenzo.Biblioteca.model.Utente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrestitiDto {
    private Long id;
    private LocalDate dataprestito;
    private LocalDate datarestituizione;
    private UtenteDto utenteDto;
    private LibroDto libroDto;
}
