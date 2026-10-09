package br.com.soft.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.soft.soft.entity.Servico;
import br.com.soft.soft.repository.ServicoRepository;

@Service
public class ServicoService {
    
    @Autowired
    private ServicoRepository servicoRepository;

    //Método para salvar o serviço
    public Servico save(Servico servico) {
        return servicoRepository.save(servico);
    }

    //Método para listar todos os serviços
    public List<Servico> findAll() {
        return servicoRepository.findAll();
    }

    //Método para excluir um serviço pelo id
    public void deleteById(Integer id) {
        servicoRepository.deleteById(id);
    }

    //Método para encontrar um serviço pelo id
    public Servico findById(Integer id) {
        return servicoRepository.findById(id).orElse(null);
    }
    

}
