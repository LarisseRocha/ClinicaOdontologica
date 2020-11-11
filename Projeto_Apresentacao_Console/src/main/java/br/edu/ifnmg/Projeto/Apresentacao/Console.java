/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Apresentacao;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Usuario;
import br.edu.ifnmg.Projeto.LogicaAplicacao.UsuarioRepositorio;
import br.edu.ifnmg.Projeto.Persistencia.UsuarioDAO;

/**
 *
 * @author larisse
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UsuarioRepositorio repo = new UsuarioDAO();
                
        Usuario u = new Usuario();
        u.setLogin("Larisse");
        u.setSenha("123");
        
        
        if(repo.Salvar(u)){
            System.out.println("Sucesso!");
        }else{
            System.out.println("Falha");
        
    }
    
    }
}
