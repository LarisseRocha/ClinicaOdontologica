/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Atendimento;
import br.edu.ifnmg.Projeto.LogicaAplicacao.AtendimentoRepositorio;
import java.util.List;

/**
 *
 * @author larisse
 */
public class AtendimentoDAO extends DataAccessObject<Atendimento> implements AtendimentoRepositorio{

    public AtendimentoDAO() {
        
        super(Atendimento.class);       
        
    }

    @Override
    public List<Atendimento> Buscar(Atendimento obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
