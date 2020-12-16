/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.LogicaAplicacao;

import java.io.Console;
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
public class RepositorioFactory {
    private static Properties propriedades = new Properties();
   
    private static UsuarioRepositorio usuario;
    private static PessoaPacienteRepositorio paciente;
    private static PessoaDentistaRepositorio dentista;
    private static ServicoRepositorio servico;
    private static PessoaRepositorio pessoa;
    
    static{
        
        FileReader leitorArquivo = null;
       
        try {
           
            File arquivoPropriedades = new File ("config.properties");
            leitorArquivo = new FileReader(arquivoPropriedades);
            propriedades.load(leitorArquivo);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                leitorArquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private static Object getInstancia(String nomeclasse){
        
         try{
            Class classe = Class.forName(nomeclasse);
            Object instancia =  classe.getDeclaredConstructor().newInstance();
            
            return instancia;           
           
            
          }catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex){
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }  
         
        return null;
    }
    
    
    public static UsuarioRepositorio getUsuarioRepositorio(){
        if(usuario == null){
            String nomeclasse = propriedades.getProperty("UsuarioRepositorio");
            usuario = (UsuarioRepositorio) getInstancia(nomeclasse);
        }
        return usuario;       
    
    }
    
     
      public static ServicoRepositorio getServicoRepositorio(){
        if(servico == null){
            String nomeclasse = propriedades.getProperty("ServicoRepositorio");
            servico = (ServicoRepositorio) getInstancia(nomeclasse);
        }
        return servico;       
    
    }
   
      
     public static PessoaPacienteRepositorio getPessoaPacienteRepositorio(){
        if(paciente == null){
            String nomeclasse = propriedades.getProperty("PessoaPacienteRepositorio");
            paciente = (PessoaPacienteRepositorio) getInstancia(nomeclasse);
        }
        return paciente;       
    
    }
   
       
     public static PessoaRepositorio getPessoaRepositorio(){
        if(pessoa == null){
            String nomeclasse = propriedades.getProperty("PessoaRepositorio");
            pessoa = (PessoaRepositorio) getInstancia(nomeclasse);
        }
        return pessoa;       
    
    }       
         
    
    
}
