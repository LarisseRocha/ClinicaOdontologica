/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Dentista;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Paciente;
import br.edu.ifnmg.Projeto.LogicaAplicacao.PessoaDentistaRepositorio;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author larisse
 */
public class DentistaDAO extends DataAccessObject<Dentista> implements PessoaDentistaRepositorio {

    public DentistaDAO() {
        super(Paciente.class);
    }

  
    @Override
    public List<Dentista> Buscar(Dentista obj) {
       /*Query consulta = this.manager.createQuery("select dt from Dentista");
       return consulta.getResultList();*/
        throw new UnsupportedOperationException("Not supported yet.");
    }

   /* @Override
    public Dentista AbrirPorRegistro(String registro) {
      Query consulta = this.manager.createQuery("select dt from Dentista dt where dt.Registro=:parametro");
      consulta.setParameter("parametro", registro);
      return (Dentista) consulta.getSingleResult();
    }*/

   
    
}
