/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Paciente;
import br.edu.ifnmg.Projeto.LogicaAplicacao.PessoaPacienteRepositorio;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author larisse
 */
public class PacienteDAO extends DataAccessObject<Paciente>
        implements PessoaPacienteRepositorio {

    public PacienteDAO() {
        super(Paciente.class);
    }

    @Override
    public List<Paciente> Buscar(Paciente obj) {
        
        String jpql = "select pac from Paciente pac";
        //String filtros = "";
        HashMap<String, Object> parametros = new HashMap<>();
        
            if(obj != null){

                if(obj.getNome() != null & !obj.getNome().isEmpty())
                    parametros.put("nome", obj.getNome());
                if(obj.getId()> 0)
                    parametros.put("id", obj.getId());
            }
            
            if(obj.getTelefone().length() > 0){
                String filtros = "";
                filtros += "pac.telefone like :telefone";
                parametros.put("telefone", obj.getTelefone() + "%");
            }
            
             if(obj.getCpf().length() > 0){
                String filtros = "";
                filtros += "pac.cpf like :cpf";
                parametros.put("cpf", obj.getTelefone() + "%");
            }
             
            if(!parametros.isEmpty()){
                String filtros = "";
                jpql += " where ";
                for(String campo : parametros.keySet()){
                    if(!filtros.isEmpty())
                        filtros += " and ";
                    jpql += "pac." + campo + " =:" + campo;
                }
                jpql += filtros;
            }

            
            
            Query sql = this.manager.createQuery(jpql);
            
            
            if(!parametros.isEmpty())
                for(String campo: parametros.keySet())
                    sql.setParameter(campo, parametros.get(campo));
            
            return sql.getResultList();
           
           
            
    }     
     

/*    @Override
    public Paciente AbrirPorCpf(String cpf) {
      Query consulta = this.manager.createQuery("select pac from Paciente pac where pac.cpf=:parametro");
      consulta.setParameter("parametro", cpf);
      return (Paciente) consulta.getSingleResult();
    }*/

 
    
}
