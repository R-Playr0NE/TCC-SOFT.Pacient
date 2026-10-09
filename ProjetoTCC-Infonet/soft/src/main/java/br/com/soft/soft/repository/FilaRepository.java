package br.com.soft.soft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.soft.entity.Fila;

public interface FilaRepository extends JpaRepository <Fila, Integer> {
    
}
