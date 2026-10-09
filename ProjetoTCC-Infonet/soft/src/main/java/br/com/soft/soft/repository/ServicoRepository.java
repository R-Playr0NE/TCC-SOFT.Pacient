package br.com.soft.soft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.soft.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
    
}
