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

import br.com.soft.soft.entity.Atendimento;
import br.com.soft.soft.service.AtendimentoService;

@Controller
@RequestMapping("/atendimentos")
public class AtendimentoController {
    
    @Autowired
    private AtendimentoService atendimentoService;

    //Método para salvar o atendimento
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Atendimento atendimento) {
        atendimentoService.save(atendimento);
        return "redirect:/atendimentos/listar";
    }

    //Método para listar todos os atendimento
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Atendimento> atendimentos = atendimentoService.findAll();
        model.addAttribute("atendimentos", atendimentos);
        return "atendimento/listarAtendimentos";
    }
    
    //Método para exibir o formulário de cadastro do atendimento
    @GetMapping("/criar")
        public String criar(Model model) {
            model.addAttribute("atendimento", new Atendimento());
            return "atendimento/formularioAtendimento";
    }

    //Método para excluir o atendimento
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        atendimentoService.deleteById(id);
        return "redirect:/atendimento/listar";
    }
    
    //Método para listar o atendimento
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Atendimento atendimento = atendimentoService.findById(id);
        model.addAttribute("atendimento", atendimento);
        return "atendimento/formularioAtendimento";
    }

}
