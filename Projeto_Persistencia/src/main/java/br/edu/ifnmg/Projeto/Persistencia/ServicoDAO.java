/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Servico;
import br.edu.ifnmg.Projeto.LogicaAplicacao.ServicoRepositorio;
import java.util.List;

/**
 *
 * @author larisse
 */
public class ServicoDAO extends DataAccessObject<Servico> implements ServicoRepositorio{
    
    public ServicoDAO(){
        super(Servico.class);
    }

    @Override
    public List<Servico> Buscar(Servico obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
