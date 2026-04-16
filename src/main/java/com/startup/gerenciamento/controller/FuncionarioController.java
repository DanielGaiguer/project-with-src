/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.startup.gerenciamento.controller;

import com.startup.gerenciamento.model.FuncionarioDTO;
import com.startup.gerenciamento.service.FuncionarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FuncionarioController {
    
    @Autowired 
    private FuncionarioService service;
    
    @GetMapping("/funcionarios")
    public String getFuncionarios(Model model) {
        List<FuncionarioDTO> lista = service.lerTodos();
        model.addAttribute("lista", lista);
        return "funcionarios";
    }
    
    @GetMapping("/perfil")
    public String getPerfil(@RequestParam(required = false) Integer id, Model model){
        if (id != null){
             FuncionarioDTO perfil = service.getPerfil(id);
            model.addAttribute("perfil", perfil);
            return "perfil";
        }else{
            FuncionarioDTO funcionario = new FuncionarioDTO();
            funcionario.setNome("");
            funcionario.setCargo("");
            funcionario.setDepartamento("");
            funcionario.setEmail("");
            funcionario.setDataContratacao(null);
            model.addAttribute("perfil", funcionario);
            return "perfil";
        }
    }
    
    @PostMapping("/salvar")
    public String atualizarFuncionario(@ModelAttribute FuncionarioDTO funcionario){
        service.setPerfil(funcionario);
        return "redirect:/funcionarios";
    }
    
}
