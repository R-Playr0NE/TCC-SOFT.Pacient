package br.com.soft.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.soft.soft.entity.TipoAtendimento;
import br.com.soft.soft.repository.TipoAtendimentoRepository;

@Service
public class TipoAtendimentoService {
    
    @Autowired
    private TipoAtendimentoRepository tipoAtendimentoRepository;

    //Método para salvar o tipo do atendimento
    public TipoAtendimento save(TipoAtendimento tipoAtendimento) {
        return tipoAtendimentoRepository.save(tipoAtendimento);
    }

    //Método para listar todos os tipos de atendimentos
    public List<TipoAtendimento> findAll() {
        return tipoAtendimentoRepository.findAll();
    }

    //Método para excluir um tipo de atendimento pelo id
    public void deleteById(Integer id) {
        tipoAtendimentoRepository.deleteById(id);
    }

    //Método para encontrar um tipo de atendimento pelo id
    public TipoAtendimento findById(Integer id) {
        return tipoAtendimentoRepository.findById(id).orElse(null);
    }

}
