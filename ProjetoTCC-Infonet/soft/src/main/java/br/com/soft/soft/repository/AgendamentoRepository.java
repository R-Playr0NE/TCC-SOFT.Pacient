package br.com.soft.soft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.soft.entity.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {
    
}
