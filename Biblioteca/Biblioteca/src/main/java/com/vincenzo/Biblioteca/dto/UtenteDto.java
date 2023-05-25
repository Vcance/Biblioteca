package com.vincenzo.Biblioteca.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtenteDto {
    private Long id;
    private String nome;
    private String cognome;
    private String indirizzo;
}
