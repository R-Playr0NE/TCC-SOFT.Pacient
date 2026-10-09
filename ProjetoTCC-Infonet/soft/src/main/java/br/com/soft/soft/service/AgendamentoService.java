package br.com.soft.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.soft.soft.entity.Agendamento;
import br.com.soft.soft.repository.AgendamentoRepository;

@Service
public class AgendamentoService {
    
    @Autowired
    private AgendamentoRepository agendamentoRepository;

    //Método para salvar o agendamento
    public Agendamento save(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    //Método para listar todos os agendamentos
    public List<Agendamento> findAll() {
        return agendamentoRepository.findAll();
    }

    //Método para excluir um agendamento pelo id
    public void deleteById(Integer id) {
        agendamentoRepository.deleteById(id);
    }

    //Método para encontrar um agendamento pelo id
    public Agendamento findById(Integer id) {
        return agendamentoRepository.findById(id).orElse(null);
    }

}
