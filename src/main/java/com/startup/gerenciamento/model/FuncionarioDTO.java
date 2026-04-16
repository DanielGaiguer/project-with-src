/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.startup.gerenciamento.model;

import java.sql.Date;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class FuncionarioDTO {
    private int id;
    @NotBlank(message = "O cargo não pode estar em branco")
    private String cargo;
    @NotBlank(message = "O nome não pode estar em branco")
    private String nome;
    @NotBlank(message = "O departamento não pode estar em branco")
    private String departamento;
    @NotBlank(message = "O email não pode estar em branco")
    private String email;
    @NotNull(message = "A data não pode estar em branco")
    private Date dataContratacao;

    public FuncionarioDTO() {
    }

    public FuncionarioDTO(int id, String cargo, String nome, String departamento, String email, Date dataContratacao) {
        this.id = id;
        this.cargo = cargo;
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
        this.dataContratacao = dataContratacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date data_contratacao) {
        this.dataContratacao = data_contratacao;
    }
    
}
