/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Dentista;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Paciente;
import br.edu.ifnmg.Projeto.LogicaAplicacao.PessoaDentistaRepositorio;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author larisse
 */
public class DentistaDAO extends DataAccessObject<Dentista> implements PessoaDentistaRepositorio {

    public DentistaDAO() {
        super(Dentista.class);
    }

  
    @Override
    public List<Dentista> Buscar(Dentista obj) {
       String jpql = "select d from Dentista d";
        //String filtros = "";
        HashMap<String, Object> parametros = new HashMap<>();
        
            if(obj != null){

                if(obj.getNome() != null & !obj.getNome().isEmpty())
                    parametros.put("nome", obj.getNome());
                if(obj.getId()> 0)
                    parametros.put("id", obj.getId());
            }
            
            if(obj.getCpf().length() > 0){
                String filtros = "";
                filtros += "d.Cpf like :d";
                parametros.put("Cpf", obj.getCpf() + "%");
            }
            
             if(obj.getRg().length() > 0){
                String filtros = "";
                filtros += "d.cpf like :d";
                parametros.put("rg", obj.getRg() + "%");
            }
             
            if(obj.getRegistro().length() > 0){
                String filtros = "";
                filtros += "d.cpf like :d";
                parametros.put("registro", obj.getRegistro() + "%");
            }
             
            if(!parametros.isEmpty()){
                String filtros = "";
                jpql += " where ";
                for(String campo : parametros.keySet()){
                    if(!filtros.isEmpty())
                        filtros += " and ";
                    jpql += "d." + campo + " =:" + campo;
                }
                jpql += filtros;
            }
      
            Query sql = this.manager.createQuery(jpql);
            
            
            if(!parametros.isEmpty())
                for(String campo: parametros.keySet())
                    sql.setParameter(campo, parametros.get(campo));
            
            return sql.getResultList();
           
           
    }

   /* @Override
    public Dentista AbrirPorRegistro(String registro) {
      Query consulta = this.manager.createQuery("select dt from Dentista dt where dt.Registro=:parametro");
      consulta.setParameter("parametro", registro);
      return (Dentista) consulta.getSingleResult();
    }*/

   
    
}

// throw new UnsupportedOperationException("Not supported yet.");