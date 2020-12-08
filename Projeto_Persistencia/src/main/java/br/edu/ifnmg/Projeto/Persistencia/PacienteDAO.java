/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Paciente;
import br.edu.ifnmg.Projeto.LogicaAplicacao.PessoaPacienteRepositorio;
import java.util.List;

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
        return null;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
