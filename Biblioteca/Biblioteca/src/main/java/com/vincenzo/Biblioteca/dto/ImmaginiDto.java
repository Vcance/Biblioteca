package com.vincenzo.Biblioteca.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImmaginiDto {

    private Long id;
    public String url;
    public String nome;
}
