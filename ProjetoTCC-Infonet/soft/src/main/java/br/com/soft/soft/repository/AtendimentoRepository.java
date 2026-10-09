package br.com.soft.soft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.soft.entity.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer> {
    
}
