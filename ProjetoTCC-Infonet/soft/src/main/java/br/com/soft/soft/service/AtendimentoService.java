package br.com.soft.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.soft.soft.entity.Atendimento;
import br.com.soft.soft.repository.AtendimentoRepository;

@Service
public class AtendimentoService {
    
    @Autowired
    private AtendimentoRepository atendimentoRepository;

   //Método para salvar o atendimento
   public Atendimento save(Atendimento atendimento) {
    return atendimentoRepository.save(atendimento);
    }

    //Método para listar todos os atendimentos
    public List<Atendimento> findAll() {
        return atendimentoRepository.findAll();
    }

    //Método para excluir um atendimento pelo id
    public void deleteById(Integer id) {
        atendimentoRepository.deleteById(id);
    }

    //Método para encontrar um atendimento pelo id
    public Atendimento findById(Integer id) {
        return atendimentoRepository.findById(id).orElse(null);
    }


}
