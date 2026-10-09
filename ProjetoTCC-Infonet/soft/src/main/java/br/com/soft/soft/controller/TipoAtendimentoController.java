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

import br.com.soft.soft.entity.TipoAtendimento;
import br.com.soft.soft.service.TipoAtendimentoService;

@Controller
@RequestMapping("/tipoAgendamentos")
public class TipoAtendimentoController {

    @Autowired
    private TipoAtendimentoService tipoAtendimentoService;

    //Método para salvar o tipo do atendimento
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute TipoAtendimento tipoAtendimento) {
        tipoAtendimentoService.save(tipoAtendimento);
        return "redirect:/tipoAtendimentos/listar";
    }

    //Método para listar todos os tipos de atendimentos
    @GetMapping("/listar")
    public String listar(Model model) {
        List<TipoAtendimento> tipoAtendimentos = tipoAtendimentoService.findAll();
        model.addAttribute("tipoAtendimentos", tipoAtendimentos);
        return "tipoAtendimento/listarTipoAtendimentos";
    }
    
    //Método para exibir o formulário de cadastro do tipo de atendimento
    @GetMapping("/criar")
        public String criar(Model model) {
            model.addAttribute("tipoAtendimento", new TipoAtendimento());
            return "tipoAtendimento/formularioTipoAtendimento";
    }

    //Método para excluir o tipo do atendimento
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        tipoAtendimentoService.deleteById(id);
        return "redirect:/tipoAtendimento/listar";
    }
    
    //Método para listar o tipo do atendimento
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        TipoAtendimento tipoAtendimento = tipoAtendimentoService.findById(id);
        model.addAttribute("tipoAtendimento", tipoAtendimento);
        return "tipoAtendimento/formularioTipoAtendimento";
    }
    
}
