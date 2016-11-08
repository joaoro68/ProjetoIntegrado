/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceplan.prog3.projetointegrado.modelo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Richard
 */
public class Senso implements Serializable {
    private Long id;
    private String nome;
    private List<Pergunta> perguntas;

    public List<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
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

    @Override
    public String toString() {
        return "Senso{" + "id=" + id + ", nome=" + nome + '}';
    }
    
    
}
