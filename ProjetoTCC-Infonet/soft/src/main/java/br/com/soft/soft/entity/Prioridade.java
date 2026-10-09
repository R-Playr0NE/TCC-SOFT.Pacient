package br.com.soft.soft.entity;

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

public class Prioridade {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer idPrioridade;

    @Column (nullable = false, length = 50)
    private String nomePrioridade;

    @Column (nullable = false, length = 1)
    private Integer nivelPrioridade;

    @Column (nullable = false, length = 350)
    private String descricaoPrioridade;
    
    
}
