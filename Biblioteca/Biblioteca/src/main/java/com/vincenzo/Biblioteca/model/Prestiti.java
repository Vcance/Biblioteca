package com.vincenzo.Biblioteca.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Prestiti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataprestito;
    private LocalDate datarestituizione;
    @ManyToOne
    @JoinColumn(name = "libroid")
    private Libro libro;
    @ManyToOne
    @JoinColumn(name = "utenteid")
    private Utente utente;

}
