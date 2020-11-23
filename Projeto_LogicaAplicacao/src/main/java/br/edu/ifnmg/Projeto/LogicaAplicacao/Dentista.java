/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.LogicaAplicacao;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author larisse
 */
@Entity
@Table(name = "Dentista")
@DiscriminatorValue(value = "1")
public class Dentista extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(length = 11, nullable = false)
    private String nome;
    
    @Column(length = 11, nullable = false, unique = true)
    private String cpf;
    
    @Column(length = 11, nullable = false)
    private String rg;
    
    @Column(length = 11, nullable = false)
    private String CRO;

    public Dentista() {
        super();
        this.cpf = "";
        this.nome = "";
        this.rg = "";
        this.CRO = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCRO() {
        return CRO;
    }

    public void setCRO(String CRO) {
        this.CRO = CRO;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.cpf);
        hash = 67 * hash + Objects.hashCode(this.CRO);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dentista other = (Dentista) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.CRO, other.CRO)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return cpf;
    }
    
    

    

    
}
