/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceplan.prog3.projetointegrado.modelo;

import java.io.Serializable;

/**
 *
 * @author Richard
 */
public class Pergunta implements Serializable{
    private Long id_pergunta;
    private String descricao;
    private Senso senso; 

    public Long getId_pergunta() {
        return id_pergunta;
    }

    public void setId_pergunta(Long id_pergunta) {
        this.id_pergunta = id_pergunta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Senso getSenso() {
        return senso;
    }

    public void setSenso(Senso senso) {
        this.senso = senso;
    }

    @Override
    public String toString() {
        return "Pergunta{" + "id_pergunta=" + id_pergunta + ", descricao=" + descricao + ", senso=" + senso + '}';
    }
    
    
}
