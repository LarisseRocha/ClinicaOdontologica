/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Paciente;
import br.edu.ifnmg.Projeto.LogicaAplicacao.PessoaPacienteRepositorio;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author larisse
 */
public class PacienteDAO extends DataAccessObject<Paciente> implements PessoaPacienteRepositorio {

    public PacienteDAO() {
        super(Paciente.class);
    }

    @Override
    public List<Paciente> Buscar(Paciente obj) {
      Query consulta = this.manager.createQuery("select pac from Paciente pac");
      return consulta.getResultList();
    }

    @Override
    public Paciente AbrirPorCpf(String cpf) {
      Query consulta = this.manager.createQuery("select pac from Paciente pac where pac.cpf=:parametro");
      consulta.setParameter("parametro", cpf);
      return (Paciente) consulta.getSingleResult();
    }

    
 
    
}
