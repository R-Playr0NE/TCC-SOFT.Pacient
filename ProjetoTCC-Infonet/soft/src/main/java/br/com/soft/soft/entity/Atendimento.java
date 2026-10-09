package br.com.soft.soft.entity;

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
public class Atendimento {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer idAtendimento;

    private LocalDateTime dataEntrada;
    
    private LocalDateTime dataInicio;

    private LocalDateTime dataFinal;

    @Column (nullable = false, length = 100)
    private String statusAtendimento;

}
