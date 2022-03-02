package com.example.demo.DTOs;

import com.example.demo.models.PessoaModel;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class PessoaDTO implements Serializable {

    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String email;

    @NotNull
    private String senha;

    public PessoaDTO() {
    }

    public PessoaDTO(PessoaModel pessoaModel) {
        this.id = pessoaModel.getId();
        this.nome = pessoaModel.getNome();
        this.email = pessoaModel.getEmail();
        this.senha = pessoaModel.getSenha();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
