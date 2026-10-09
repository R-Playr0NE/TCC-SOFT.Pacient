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

import br.com.soft.soft.entity.Fila;
import br.com.soft.soft.service.FilaService;

@Controller 
@RequestMapping("/filas")
public class FilaController {

    @Autowired 
    private FilaService filaService;

    //Método para salvar a fila
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Fila fila) {
        filaService.save(fila);
        return "redirect:/filas/listar";
    }

    //Método para listar todos as filas
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Fila> filas = filaService.findAll();
        model.addAttribute("filas", filas);
        return "fila/listarFilas";
    }
    
    //Método para exibir o formulário de cadastro da fila
    @GetMapping("/criar")
        public String criar(Model model) {
            model.addAttribute("fila", new Fila());
            return "fila/formularioFila";
    }

    //Método para excluir a fila
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        filaService.deleteById(id);
        return "redirect:/filas/listar";
    }
    
    //Método para listar a fila
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Fila fila = filaService.findById(id);
        model.addAttribute("fila", fila);
        return "fila/formularioFila";
    }

}
