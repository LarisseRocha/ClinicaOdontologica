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
import javax.persistence.Version;

/**
 *
 * @author larisse
 */
@Entity
@DiscriminatorValue(value = "2")
public class Paciente extends Pessoa implements Serializable {

    @Column(length = 250, nullable = false)
    private String nome;
    
    @Column(length = 250, nullable = false)
    private String rg;
    
    @Column(length = 250)
    private String email;
    
    @Version
    private int version;

    public Paciente() {
        
        super();
        this.nome = "";
        this.email = "";
        this.email = "";
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
