package br.com.soft.soft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.soft.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

}