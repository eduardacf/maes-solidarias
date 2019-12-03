package com.tcc.maes_solidarias.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int colaboradorId;

    @NotEmpty(message = "Nome é obrigatório")
    private String nome;

    @NotEmpty(message = "Email é obrigatório")
    private String email;

    private String apelido;

    @NotEmpty(message = "Endereço é obrigatório")
    private String endereco;

    @NotEmpty(message = "Instrução é obrigatório")
    private String instrucao;

    public int getColaboradorId() { return colaboradorId; }

    public void setColaboradorId(int colaboradorId) { this.colaboradorId = colaboradorId; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
