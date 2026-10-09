package br.com.soft.soft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.soft.entity.EntradaFila;

public interface EntradaFilaRepository extends JpaRepository <EntradaFila, Integer> {
    
}
