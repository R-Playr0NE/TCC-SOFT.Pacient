package br.com.soft.soft.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import br.com.soft.soft.enums.tipoNotificacao;
import br.com.soft.soft.enums.statusNotificacao;

@Entity 
@Setter 
@Getter 
@AllArgsConstructor 
@NoArgsConstructor 

public class Notificacao {

    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer idNotificacao;

    @Column (nullable = false, length = 500)
    private String mensagemPrioridade;

    private LocalDateTime dataNotificacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoNotificacao", nullable = false)
    private tipoNotificacao tipo;

    @Enumerated (EnumType.STRING)
    @Column (name =  "statusNotificacao", nullable = false)
    private statusNotificacao status;
    
    
}
