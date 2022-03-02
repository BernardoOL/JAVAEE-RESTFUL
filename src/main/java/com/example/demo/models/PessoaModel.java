package com.example.demo.models;

import com.example.demo.DTOs.PessoaDTO;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_pessoa")
@NamedQueries({@NamedQuery(name = "Pessoa.getByName", query = "SELECT p FROM PessoaModel p WHERE p.nome = :nome")})
public class PessoaModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String senha;

    public PessoaModel() {
    }

    public PessoaModel(PessoaDTO pessoaDTO) {
        this.id = pessoaDTO.getId();
        this.nome = pessoaDTO.getNome();
        this.email = pessoaDTO.getEmail();
        this.senha = pessoaDTO.getSenha();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
