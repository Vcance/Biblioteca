package com.vincenzo.Biblioteca.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibroDto {
    private Long id;
    private String nomelibro;
    private String codicelibro;
    private String autore;
}

