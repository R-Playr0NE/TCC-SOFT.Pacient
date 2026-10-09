package br.com.soft.soft.entity;

import java.sql.Time;

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

public class Servico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdServico;

    @Column(nullable = false, length = 100)
    private String nomeServico;

    @Column(nullable = false, length = 350)
    private String descricaoServico;

    private Time duracaoServico;
    
}
