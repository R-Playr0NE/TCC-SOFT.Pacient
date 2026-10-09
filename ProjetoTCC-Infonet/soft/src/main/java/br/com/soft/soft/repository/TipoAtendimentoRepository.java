package br.com.soft.soft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.soft.entity.TipoAtendimento;

public interface TipoAtendimentoRepository extends JpaRepository<TipoAtendimento, Integer> {
    
}
