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

import br.com.soft.soft.entity.Servico;
import br.com.soft.soft.service.ServicoService;

@Controller
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    //Método para salvar o paciente
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Servico servico) {
        servicoService.save(servico);
        return "redirect:/pacientes/listar";
    }

    //Método para listar todos os serviços
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Servico> servicos = servicoService.findAll();
        model.addAttribute("servicos", servicos);
        return "servico/listarServicos";
    }
    
    //Método para exibir o formulário de cadastro de serviço
    @GetMapping("/criar")
        public String criar(Model model) {
            model.addAttribute("servico", new Servico());
            return "servico/formularioServico";
    }

    //Método para excluir o servico
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        servicoService.deleteById(id);
        return "redirect:/servicos/listar";
    }
    
    //Método para listar o servico
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Servico servico = servicoService.findById(id);
        model.addAttribute("servico", servico);
        return "servico/formularioServico";
    }
    
}
