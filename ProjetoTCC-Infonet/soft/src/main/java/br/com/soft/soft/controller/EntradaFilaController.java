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

import br.com.soft.soft.entity.EntradaFila;
import br.com.soft.soft.service.EntradaFilaService;

@Controller 
@RequestMapping ("/entradafilas")
public class EntradaFilaController {
    
    @Autowired 
    private EntradaFilaService entradaFilaService;

     //Método para salvar a entrada na fila
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute EntradaFila entradaFila) {
        entradaFilaService.save(entradaFila);
        return "redirect:/entradaFilas/listar";
    }

    //Método para listar todas as entradas nas filas
    @GetMapping("/listar")
    public String listar(Model model) {
        List<EntradaFila> entradaFilas = entradaFilaService.findAll();
        model.addAttribute("entradaFilas", entradaFilas);
        return "entradaFila/listarEntradaFilas";
    }
    
    //Método para exibir o formulário de cadastro da entrada na fila
    @GetMapping("/criar")
        public String criar(Model model) {
            model.addAttribute("entradaFila", new EntradaFila());
            return "entradaFila/formularioEntradaFila";
    }

    //Método para excluir a entrada na fila
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        entradaFilaService.deleteById(id);
        return "redirect:/entradaFilas/listar";
    }
    
    //Método para listar a entrada na fila
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        EntradaFila entradaFila = entradaFilaService.findById(id);
        model.addAttribute("entradaFila", entradaFila);
        return "entradaFila/formularioEntradaFila";
    }

}
