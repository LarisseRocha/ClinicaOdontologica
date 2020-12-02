/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Apresentacao;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Atendimento;
import br.edu.ifnmg.Projeto.LogicaAplicacao.AtendimentoRepositorio;
import br.edu.ifnmg.Projeto.LogicaAplicacao.AtendimentoServico;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Dentista;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Paciente;
import br.edu.ifnmg.Projeto.LogicaAplicacao.PessoaDentistaRepositorio;
import br.edu.ifnmg.Projeto.LogicaAplicacao.PessoaPacienteRepositorio;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Servico;
import br.edu.ifnmg.Projeto.LogicaAplicacao.ServicoRepositorio;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Usuario;
import br.edu.ifnmg.Projeto.LogicaAplicacao.UsuarioRepositorio;
import br.edu.ifnmg.Projeto.Persistencia.AtendimentoDAO;
import br.edu.ifnmg.Projeto.Persistencia.DentistaDAO;
import br.edu.ifnmg.Projeto.Persistencia.PacienteDAO;
import br.edu.ifnmg.Projeto.Persistencia.ServicoDAO;
import br.edu.ifnmg.Projeto.Persistencia.UsuarioDAO;

/**
 *
 * @author larisse
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void criarBase(){
        
        UsuarioRepositorio repou = new UsuarioDAO();
        repou.Salvar(new Usuario("Recepcao1", "123"));
        repou.Salvar(new Usuario("Recepcao2", "123"));
        
        PessoaDentistaRepositorio repod = new DentistaDAO();
        repod.Salvar(new Dentista("João","000.000.000-00","00.000.000","xxxxxx"));
        repod.Salvar(new Dentista("Mariana","111.111.111-11","11.111.111","yyyyyy"));
        repod.Salvar(new Dentista("Julia","333.333.333-33","33.333.333","zzzzzz"));
        
        PessoaPacienteRepositorio repop = new PacienteDAO();
        repop.Salvar(new Paciente("Jonas Márcio","000.000.000-00","jonas23@mail.com"));
        repop.Salvar(new Paciente("Maria Eduarda","111.111.111-11","maria1024@gmail.com"));
        repop.Salvar(new Paciente("Junior Do Nascimento","333.333.333-33","Sem email"));
        repop.Salvar(new Paciente("Jose Silva","444.333.333-33","Sem email"));
        repop.Salvar(new Paciente("Junior Oliveira","333.333.333-33","Sem email"));
        
        ServicoRepositorio repos = new ServicoDAO();
        repos.Salvar(new Servico("Implante dentário", "1.050"));
        repos.Salvar(new Servico("Clareamento", "800"));
        repos.Salvar(new Servico("Prótese dentária", "800"));
        repos.Salvar(new Servico("Extracao", "300"));
        
        var user1 = repou.Abrir(1L);
        var user2 = repou.Abrir(2L);
        
        var dentista1 = repod.Abrir(1L);
        var dentista2 = repod.Abrir(2L);
        
        var paciente1 = repop.Abrir(1L);
        var paciente2 = repop.Abrir(2L);
        
        var servico1 = repos.Abrir(1L);
        var servico2 = repos.Abrir(2L);
        var servico3 = repos.Abrir(3L);
        var servico4 = repos.Abrir(4L);
        
        AtendimentoRepositorio repoa = new AtendimentoDAO();
        
        Atendimento a1 = new Atendimento(paciente1, user2 );
        a1.add(new AtendimentoServico(servico2, 1));
        a1.add(new AtendimentoServico(servico1, 1));
        
        repoa.Salvar(a1);
        
        Atendimento a2 = new Atendimento(paciente2, user1 );
        a2.add(new AtendimentoServico(servico2, 1));
        a2.add(new AtendimentoServico(servico3, 3));
        
        repoa.Salvar(a2);
        
        Atendimento a3 = new Atendimento(paciente1, user1 );
        a3.add(new AtendimentoServico(servico2, 1));
        a3.add(new AtendimentoServico(servico1, 1));
        
        repoa.Salvar(a3);
        
        Atendimento a4 = new Atendimento(paciente2, user1 );
        a4.add(new AtendimentoServico(servico2, 1));
        a4.add(new AtendimentoServico(servico1, 1));
        
        repoa.Salvar(a4);
         
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* UsuarioRepositorio repo = new UsuarioDAO();
                
        Usuario u = new Usuario();
        u.setLogin("Larisse");
        u.setSenha("123");
        
        
        if(repo.Salvar(u)){
            System.out.println("Sucesso!");
        }else{
            System.out.println("Falha");
        
    }*/
             criarBase();
    }
}
