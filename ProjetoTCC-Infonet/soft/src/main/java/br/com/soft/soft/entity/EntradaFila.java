package br.com.soft.soft.entity;

import java.sql.Time;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Setter 
@Getter 
@AllArgsConstructor 
@NoArgsConstructor 

public class EntradaFila {

    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer idEntradaFila;

    private LocalDateTime dataEntradaFila;

    private Time tempomedioEntradaFila;

    @Column  (nullable = false, length = 10)
    private Integer posicaoEntradaFila;

    @Column (nullable = false, length = 25)
    private String statusEsperaFila;

    
    
}
