/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceplan.prog3.projetointegrado.dao;

/**
 *
 * @author Richard
 */
import java.io.Serializable;
import java.util.List;

/**
 * Interface genérica para mapeamento de relações.
 * Contém os métodos básicos para manipulação dos dados em um SGBD
 * @author Carlos Alberto Cipriano Korovsky <carlos.korovsky at gmail.com>
 * @param <E> Objeto que representa a entidade (relação) no banco de dados
 * @param <K> Objeto que representa a chave primária da relação.
 */
public interface GenericDao <E, K extends Serializable> {
    
    /**
     * Salva uma nova entidade no banco de dados
     * @param tupla entidade a ser criada no banco de dados
     * @return entidade criada no banco de dados
     */
    public E create(E tupla) ;
    
    /**
     * Retorna uma tupla do banco de dados através da chave primária
     * @param id identificador da tubpla na relação (chave primária)
     * @return tupla encontrada no banco de dados ou null caso não encontrada
     */
    public E retrieve(K id);
    
    /**
     * Retorna todas as tuplas da entidade
     * @return lista contendo todas as entidades do banco
     */
    public List<E> retrieveAll();
    
    /**
     * Atualiza uma tupla no banco de dados
     * @param tupla a ser atualizada no banco de dados
     * @return tupla atualizada no banco de dados
     */
    public E update(E tupla);
    
    /**
     * Excluí uma tupla da relação
     * @param id identificador da tupla na relação
     * @return tupla excluída na relação ou null caso não encontrada
     */    
    public E delete(K id);
    
    /**
     * Excluí uma tupla da relação
     * @param tupla valor da tupla a ser excluída na relação
     * @return tupla excluída na relação ou null caso não encontrada
     */
    public E delete(E tupla);
    
}
