package br.com.soft.soft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.soft.soft.entity.Agendamento;
import br.com.soft.soft.service.AgendamentoService;

@Controller
@RequestMapping("/agendamentos")
public class AgendamentoController {
    
    @Autowired
    private AgendamentoService agendamentoService;

    //Método para salvar o agendamento
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Agendamento agendamento) {
        agendamentoService.save(agendamento);
        return "redirect:/agendamentos/listar";
    }

    //Método para listar todos os agendamentos
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Agendamento> agendamentos = agendamentoService.findAll();
        model.addAttribute("agendamentos", agendamentos);
        return "agendamento/listarAgendamentos";
    }
    
    //Método para exibir o formulário de cadastro do agendamento
    @GetMapping("/criar")
        public String criar(Model model) {
            model.addAttribute("agendamento", new Agendamento());
            return "agendamento/formularioAgendamento";
    }

    //Método para excluir o agendamento
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        agendamentoService.deleteById(id);
        return "redirect:/agendamento/listar";
    }
    
    //Método para listar o agendamento
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Agendamento agendamento = agendamentoService.findById(id);
        model.addAttribute("agendamento", agendamento);
        return "agendamento/formularioAgendamento";
    }

}
