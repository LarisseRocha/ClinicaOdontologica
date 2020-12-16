/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Paciente;
import br.edu.ifnmg.Projeto.LogicaAplicacao.PessoaPacienteRepositorio;
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
        String filtro = "";
        Hashtable<String, Object> parametros = new Hashtable<>();

        if(obj != null){

          if(obj.getNome().length()>0){

              filtro += "pac.nome like :nome";
              parametros.put("nome", obj.getNome() + "%");
          }

        }
        
          if(filtro.length()>0)  
             jpql = jpql +"where" +filtro;
          Query consulta = this.manager.createQuery(jpql);

          for(String chave : parametros.keySet()) 
                 consulta.setParameter(chave, parametros.get(chave));

          return consulta.getResultList();
          

    }

/*    @Override
    public Paciente AbrirPorCpf(String cpf) {
      Query consulta = this.manager.createQuery("select pac from Paciente pac where pac.cpf=:parametro");
      consulta.setParameter("parametro", cpf);
      return (Paciente) consulta.getSingleResult();
    }*/


    
 
    
}
