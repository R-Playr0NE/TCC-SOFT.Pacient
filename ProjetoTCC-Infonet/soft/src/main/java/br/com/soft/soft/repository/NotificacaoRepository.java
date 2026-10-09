package br.com.soft.soft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.soft.entity.Notificacao;
import br.com.soft.soft.enums.statusNotificacao;
import br.com.soft.soft.enums.tipoNotificacao;


public interface NotificacaoRepository extends JpaRepository <Notificacao, Integer> {

     List<Notificacao> findByTipo(tipoNotificacao tipo);

     List<Notificacao> findByStatus(statusNotificacao status);
    
}
