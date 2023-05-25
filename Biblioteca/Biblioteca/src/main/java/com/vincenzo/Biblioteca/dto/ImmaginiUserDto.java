package com.vincenzo.Biblioteca.dto;

import com.vincenzo.Biblioteca.model.Immagini;
import com.vincenzo.Biblioteca.model.Libro;
import com.vincenzo.Biblioteca.model.Utente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImmaginiUserDto {
    private Long id;
    private UtenteDto utenteDto;
    private LibroDto libroDto;
    private ImmaginiDto immaginiDto;
}
