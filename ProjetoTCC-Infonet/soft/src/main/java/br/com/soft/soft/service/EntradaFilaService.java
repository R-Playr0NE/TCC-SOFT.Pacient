package br.com.soft.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.soft.soft.entity.EntradaFila;
import br.com.soft.soft.repository.EntradaFilaRepository;


@Service 
public class EntradaFilaService {

    @Autowired 
    private EntradaFilaRepository entradafilaRepository;
    
    //Método para salvar a entrada na fila
    public EntradaFila save(EntradaFila entradafila) {
        return entradafilaRepository.save(entradafila);
    }

    //Método para listar todas as entradas nas filas
    public List<EntradaFila> findAll() {
        return entradafilaRepository.findAll();
    }

    //Método para excluir uma entrada na fila pelo id
    public void deleteById(Integer id) {
        entradafilaRepository.deleteById(id);
    }

    //Método para encontrar uma entrada na fila pelo id
    public EntradaFila findById(Integer id) {
        return entradafilaRepository.findById(id).orElse(null);
    }
    
}
