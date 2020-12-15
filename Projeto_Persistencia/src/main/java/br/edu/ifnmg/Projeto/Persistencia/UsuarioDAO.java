/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Usuario;
import br.edu.ifnmg.Projeto.LogicaAplicacao.UsuarioRepositorio;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author larisse
 */
public class UsuarioDAO extends DataAccessObject<Usuario>
        implements UsuarioRepositorio{
    
    public UsuarioDAO(){
        super(Usuario.class);
    }

    @Override
    public boolean autenticar(String login, String senha) {
      
        Query sql = this.manager.createQuery("select o from Usuario o where o.login = :login and o.senha = :senha");
        sql.setParameter("login", login);
        sql.setParameter("senha", senha);
        
        if(sql.getResultList().size()>0)
            return true;
        return false;
    }

    @Override
    public List<Usuario> Buscar(Usuario obj) {
      
        String jpql = "select o from Usuario o";
        //String filtros = "";
        HashMap<String, Object> parametros = new HashMap<>();
        
            if(obj != null){

                if(obj.getLogin() != null & !obj.getLogin().isEmpty())
                    parametros.put("login", obj.getLogin());
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
            
        }    
    
    
    
}
