
package com.startup.gerenciamento.service;

import com.startup.gerenciamento.model.FuncionarioDTO;
import com.startup.gerenciamento.repository.FuncionarioDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioDAO repository;
    
    public List<FuncionarioDTO> lerTodos(){
        return repository.lerTodos();
    }
    
    public FuncionarioDTO getPerfil(int id) {
        return repository.getPerfil(id);
    }

    public void setPerfil(){
        FuncionarioDTO funcionario = new FuncionarioDTO();
        funcionario.setId(-1);
        setPerfil(funcionario);
    }

    public void setPerfil(FuncionarioDTO funcionario){
        if (funcionario.getId() != -1){
            repository.updatePerfil(funcionario);
            System.out.println("Funcionario atualizado com sucesso");
            System.out.println(funcionario.getId());
            return;
        }else{
            repository.createPerfil(funcionario);
            System.out.println("Funcionario criado com sucesso");
            return;
        }
    }
}
