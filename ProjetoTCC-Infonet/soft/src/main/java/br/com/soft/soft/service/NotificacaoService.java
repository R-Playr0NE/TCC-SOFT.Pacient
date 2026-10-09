package br.com.soft.soft.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.soft.soft.entity.Notificacao;
import br.com.soft.soft.enums.statusNotificacao;
import br.com.soft.soft.enums.tipoNotificacao;
import br.com.soft.soft.repository.NotificacaoRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service 
public class NotificacaoService {

    @Autowired 
    private NotificacaoRepository notificacaoRepository;

    //Criar uma nova notificação
    @Transactional
    public Notificacao criarNotificacao(String mensagem, tipoNotificacao tipo) {

        Notificacao notificacao = new Notificacao();

        notificacao.setMensagemPrioridade(mensagem);
        notificacao.setDataNotificacao(LocalDateTime.now());
        notificacao.setTipo(tipo);
        notificacao.setStatus(statusNotificacao.PENDENTE);

            return notificacaoRepository.save(notificacao);
    }

    //Mudar o status de uma notificaçao
    @Transactional 
    public Notificacao atualizarStatus(Integer idNotificacao, statusNotificacao novoStatus) {
        Notificacao notificacao = notificacaoRepository.findById(idNotificacao)
        .orElseThrow(() -> new EntityNotFoundException("Notificação não encontrada! "));

    //Alerar o status usando o Enum recebido por parâmetro
    notificacao.setStatus(novoStatus);

        return notificacao; //O Jpa atualiza o banco automaticamente 
    }

    //Buscar notificaçao por um tipo especifico 
    public List<Notificacao> listarTipo(tipoNotificacao tipo){
        return notificacaoRepository.findByTipo(tipo);
    }

    //Buscar notificação por um status especifico
    public List<Notificacao> listarStatus(statusNotificacao status){
        return notificacaoRepository.findByStatus(status);
    }


    
}
