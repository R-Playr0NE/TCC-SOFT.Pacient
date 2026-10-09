package br.com.soft.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.soft.soft.entity.Paciente;
import br.com.soft.soft.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    //Método para salvar o paciente
    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    //Método para listar todos os pacientes
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    //Método para excluir um paciente pelo id
    public void deleteById(Integer id) {
        pacienteRepository.deleteById(id);
    }

    //Método para encontrar um paciente pelo id
    public Paciente findById(Integer id) {
        return pacienteRepository.findById(id).orElse(null);
    }
    
}