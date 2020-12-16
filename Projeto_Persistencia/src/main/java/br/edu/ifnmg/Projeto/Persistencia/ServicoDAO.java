/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Servico;
import br.edu.ifnmg.Projeto.LogicaAplicacao.ServicoRepositorio;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author larisse
 */
public class ServicoDAO extends DataAccessObject<Servico> 
        implements ServicoRepositorio{
    
    public ServicoDAO(){
        super(Servico.class);
    }

    @Override
    /* public List<Servico> Buscar(Servico obj) {
          String jpql = "select o from Servicos";
          String filtros = "";
        HashMap<String, Object> parametros = new HashMap<>();
        
            if(obj != null){

                if(obj.getDescricao() != null & !obj.getDescricao().isEmpty())
                    parametros.put("Descricao", obj.getDescricao());
                if(obj.getId()>0)
                    parametros.put("id", obj.getId());
            }
            

            if(!parametros.isEmpty()){
                String filtros = "";
                jpql += " where ";
                for(String campo : parametros.keySet()){
                    if(!filtros.isEmpty())
                        filtros += " and ";
                    jpql += "o." + campo + " =:" + campo;
                }
                jpql += filtros;
            }

            
            
           // Query sql = this.manager.createQuery(jpql);
            Query sql = this.manager.createQuery(jpql);
            
            
            if(!parametros.isEmpty())
                for(String campo: parametros.keySet())
                    sql.setParameter(campo, parametros.get(campo));
            
            return sql.getResultList();
            
        }   */
    
    public List<Servico> Buscar(Servico obj) {
        
        String jpql = "select a from Servico a";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(obj.getDescricao().length() > 0){
            filtros += "a.descricao like :descricao"; 
            parametros.put("descricao", obj.getDescricao()+"%");
        }
        
        if(filtros.length() > 0)
            jpql = jpql + " where " + filtros;
        
        var query = this.manager.createQuery(jpql);
        
        for(String chave : parametros.keySet()){
            query.setParameter(chave, parametros.get(chave));
        }
        
        return query.getResultList();
    }
    
    
    
    
    
}
