/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.LogicaAplicacao;

/**
 *
 * @author larisse
 */
public interface UsuarioRepositorio extends Repositorio<Usuario> {
    
    public boolean autenticar(String login, String senha);
    
}