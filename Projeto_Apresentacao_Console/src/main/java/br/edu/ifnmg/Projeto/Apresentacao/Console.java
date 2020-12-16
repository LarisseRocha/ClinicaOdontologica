/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.Apresentacao;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Atendimento;
import br.edu.ifnmg.Projeto.LogicaAplicacao.AtendimentoItens;
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
import br.edu.ifnmg.Projeto.LogicaAplicacao.AtendimentoRepositorio;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Pessoa;
import br.edu.ifnmg.Projeto.LogicaAplicacao.RepositorioFactory;
import br.edu.ifnmg.Projeto.LogicaAplicacao.StatusAtendimento;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        repou.Salvar(new Usuario("Recepção1", "123"));
        repou.Salvar(new Usuario("Recepção2", "231"));
        
        PessoaDentistaRepositorio repod = new DentistaDAO();
        repod.Salvar(new Dentista("João","000.010.000-00","00.200.000","21345"));
        repod.Salvar(new Dentista("Mariana","111.111.111-11","11.111.111","54321"));
        repod.Salvar(new Dentista("Julia","333.433.333-33","32.333.333","22331"));
        
        PessoaPacienteRepositorio repop = new PacienteDAO();
        repop.Salvar(new Paciente("Jonas Márcio","000.000.000-00","9999-9999"));
        repop.Salvar(new Paciente("Maria Eduarda","111.111.111-11","8888-8888"));
        repop.Salvar(new Paciente("Junior Do Nascimento","333.333.333-33","0000-0000"));
        repop.Salvar(new Paciente("Jose Silva","444.333.333-33","1111-2222"));
        repop.Salvar(new Paciente("Junior Oliveira","333.333.333-33","4444-4444"));
        
        ServicoRepositorio repos = new ServicoDAO();
        repos.Salvar(new Servico("Implante dentário", "1.050"));
        repos.Salvar(new Servico("Clareamento", "800"));
        repos.Salvar(new Servico("Prótese dentária", "800"));
        repos.Salvar(new Servico("Extracao", "300"));
        
        var usuario1 = repou.Abrir(1L);
        var usuario2 = repou.Abrir(2L);
        
        var dent1 = repod.Abrir(1L);
        var dent2 = repod.Abrir(2L);
        
        var paciente1 = repop.Abrir(4L);
        var paciente2 = repop.Abrir(5L);
        
        var servico1 = repos.Abrir(1L);
        var servico2 = repos.Abrir(2L);
        var servico3 = repos.Abrir(3L);
        var servico4 = repos.Abrir(4L);
        
        AtendimentoRepositorio repoa = new AtendimentoDAO();
        
        Atendimento a1 = new Atendimento(paciente1, StatusAtendimento.Agendado, usuario2 );
        a1.add(new AtendimentoItens(servico2, 1));
        a1.add(new AtendimentoItens(servico1, 2));
                
        repoa.Salvar(a1);
        
        Atendimento a2 = new Atendimento(paciente1, StatusAtendimento.Agendado, usuario1 );
        a2.add(new AtendimentoItens(servico2, 1));
        a2.add(new AtendimentoItens(servico3, 3));
        
        repoa.Salvar(a2);
        
        Atendimento a3 = new Atendimento(paciente2, StatusAtendimento.Agendado, usuario1 );
        a3.add(new AtendimentoItens(servico4, 1));
        a3.add(new AtendimentoItens(servico1, 1));
        
        repoa.Salvar(a3);
        
        Atendimento a4 = new Atendimento(paciente1, StatusAtendimento.Agendado, usuario1 );
        a4.add(new AtendimentoItens(servico2, 1));
        a4.add(new AtendimentoItens(servico1, 1));
        
        repoa.Salvar(a4);
         
        
    }
    public static void main(String[] args){
        
//          criarBase();
            
           /* PessoaPacienteRepositorio repo_pac = new PacienteDAO();
            
            for(Pessoa pac : repo_pac.Buscar(null)){
            System.out.println(pac.getNome());
            }*/
            
          
       
        
        /*UsuarioRepositorio repo = RepositorioFactory.getUsuarioRepositorio();
        
       
        
        Usuario uw = new Usuario();
        uw.setLogin("Recepção2");
        
       for(Usuario u: repo.Buscar(uw))
            System.out.println(u);  */
       
       
        
       
          
        
       
    }  
}
