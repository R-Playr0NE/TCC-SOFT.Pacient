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

import br.com.soft.soft.entity.Paciente;
import br.com.soft.soft.service.PacienteService;


@Controller
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    //Método para salvar o paciente
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Paciente paciente) {
        pacienteService.save(paciente);
        return "redirect:/pacientes/listar";
    }

    //Método para listar todos os pacientes
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Paciente> pacientes = pacienteService.findAll();
        model.addAttribute("pacientes", pacientes);
        return "paciente/listarPacientes";
    }
    
    //Método para exibir o formulário de cadastro do paciente
    @GetMapping("/criar")
        public String criar(Model model) {
            model.addAttribute("paciente", new Paciente());
            return "paciente/formularioPaciente";
    }

    //Método para excluir o paciente
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        pacienteService.deleteById(id);
        return "redirect:/pacientes/listar";
    }
    
    //Método para listar o paciente
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Paciente paciente = pacienteService.findById(id);
        model.addAttribute("paciente", paciente);
        return "paciente/formularioPaciente";
    }
    
}