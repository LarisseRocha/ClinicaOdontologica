/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Consulta;
import java.util.List;

/**
 *
 * @author larisse
 */
public class ConsultaDAO extends DataAccessObject<Consulta>{

    public ConsultaDAO() {
        
        super(Consulta.class);       
        
    }

    @Override
    public List<Consulta> Buscar(Consulta obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
