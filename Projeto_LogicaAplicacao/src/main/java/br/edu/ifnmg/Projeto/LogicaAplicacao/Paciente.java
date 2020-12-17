/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.LogicaAplicacao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author larisse
 */
@Entity
@Table(name = "Paciente")
@DiscriminatorValue(value = "0")
public class Paciente extends Pessoa implements Serializable {
    
    @Column(length = 250, nullable = false)
    private String cpf;
    
    @Column(length = 250)
    private String telefone;
    
    @Version
    private int version;
   

    public Paciente() {
        
        super();
        this.setTipo(PessoaTipo.Paciente);
        this.telefone = "";
        this.cpf = "";
        this.version = 1;
        
    }

    public Paciente(String nome, String cpf, String telefone) {
        super();
        this.setTipo(PessoaTipo.Paciente);
        this.setNome(nome);
        this.cpf = cpf;
        this.telefone = telefone;
        this.version = version;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return cpf;
    }
    
    
   
}
