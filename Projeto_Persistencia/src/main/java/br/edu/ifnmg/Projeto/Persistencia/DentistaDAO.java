/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Persistencia;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Dentista;
import br.edu.ifnmg.Projeto.LogicaAplicacao.PessoaDentistaRepositorio;
import java.util.List;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
