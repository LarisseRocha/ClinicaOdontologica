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
    private String rg;
    
    @Column(length = 250)
    private String email;
    
    @Version
    private int version;

    public Paciente() {
        
        super();
        this.setTipo(PessoaTipo.Paciente);
        this.email = "";
        this.rg = "";
        this.version = 1;
        
    }

    public Paciente(String nome, String rg, String email) {
        super();
        this.setTipo(PessoaTipo.Paciente);
        this.setNome(nome);
        this.rg = rg;
        this.email = email;
        this.version = version;
    }


    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return rg;
    }
    
    
   
}
