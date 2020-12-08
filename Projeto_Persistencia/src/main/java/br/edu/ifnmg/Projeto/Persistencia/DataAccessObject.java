/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Repositorio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author larisse
 */
public abstract class DataAccessObject<T> implements Repositorio<T> {
    
    private Class tipo;
    private EntityManager manager;
    
    //Inicia o gerenciador de entidades
    public DataAccessObject(Class tipo){
        
        var factory = Persistence.createEntityManagerFactory("UP");
        this.manager = factory.createEntityManager();
        this.tipo = tipo;
    }

    @Override
    public boolean Salvar(T obj) {
        EntityTransaction atendimento = this.manager.getTransaction();
        try{
           atendimento.begin();            
            this.manager.persist(obj);
           atendimento.commit();
            
            return true;
        }catch(Exception ex){
            atendimento.rollback();
        }
        return false;
    }

    @Override
    public boolean Apagar(T obj) {
      EntityTransaction transacao = this.manager.getTransaction();
      try{
          transacao.begin();
          this.manager.remove(obj);
          transacao.commit();
          
          return true;
      }catch(Exception ex){
          
          transacao.rollback();
      }
        return false;
    }

    @Override
    public T Abrir(Long id) {
      try{
          T obj = (T)this.manager.find(tipo, id);
          return obj;
      }catch(Exception ex){
          return null;
      }
    }
    
    @Override
    public abstract List<T> Buscar(T obj);
    
}
