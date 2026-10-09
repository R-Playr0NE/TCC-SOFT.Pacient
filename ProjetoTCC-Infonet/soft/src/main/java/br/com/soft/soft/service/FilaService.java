package br.com.soft.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.soft.soft.entity.Fila;
import br.com.soft.soft.repository.FilaRepository;

@Service 
public class FilaService {
    
    @Autowired 
    private FilaRepository filaRepository;
    
    //Método para salvar a fila
    public Fila save(Fila fila) {
        return filaRepository.save(fila);
    }

    //Método para listar todas as filas
    public List<Fila> findAll() {
        return filaRepository.findAll();
    }

    //Método para excluir uma fila pelo id
    public void deleteById(Integer id) {
        filaRepository.deleteById(id);
    }

    //Método para encontrar uma fila pelo id
    public Fila findById(Integer id) {
        return filaRepository.findById(id).orElse(null);
    }

}
