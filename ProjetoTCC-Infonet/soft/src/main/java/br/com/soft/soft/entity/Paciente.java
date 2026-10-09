package br.com.soft.soft.entity;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPaciente;

    @Column(nullable = false, length = 100)
    private String nomePaciente;

    @Column(nullable = false, length = 12)
    private String cpfPaciente;

    @Column(nullable = false, length = 11)
    private String telPaciente;

    private LocalDateTime datanascimentoPaciente;

    @Column(nullable = false, length = 150)
    private String emailPaciente;

    @Column(nullable = false, length = 100)
    private String ruaPaciente;

    @Column(nullable = false, length = 100)
    private String bairroPaciente;

    @Column(nullable = false, length = 5)
    private Integer numresidencialPaciente;

    @Column(nullable = true, length = 150)
    private String complementoPaciente;

    @Column(nullable = false, length = 50)
    private String cidadePaciente;

    @Column(nullable = false, length = 2)
    private String estadoPaciente;
    
}