/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceplan.prog3.projetointegrado.dao;

import br.udesc.ceplan.prog3.projetointegrado.modelo.Senso;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Richard
 */
public interface SensoDao extends GenericDao<Senso, Long> {
    
  public List <Senso> findByName(String nome);
    
    
    
    
}
