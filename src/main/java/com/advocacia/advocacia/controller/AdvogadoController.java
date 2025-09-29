package com.advocacia.advocacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.advocacia.advocacia.entity.Advogado;
import com.advocacia.advocacia.service.AdvogadoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/advogados")
public class AdvogadoController {
    
    // Injeção de dependência da service de advogados
    @Autowired
    private AdvogadoService advogadoService;

    // Método para salvar um advogado
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Advogado advogado) {
        advogadoService.save(advogado);
        return "redirect:/advogados/listar";
    }
    
    // Método para listar todos os advogados
    @GetMapping("/listar")
    public String listar(Model model){
        List<Advogado> advogados = advogadoService.findAll();
        model.addAttribute("advogados", advogados);
        return "advogado/listarAdvogado";
    }

    //Método para abrir o formulário de advogado
    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("advogado", new Advogado());
        return "advogado/formularioAdvogado";
    }
   
    //Método para excluir um advogado pelo ID
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        advogadoService.deleteById(id);
        return "redirect:/advogados/listar";
    }

}
