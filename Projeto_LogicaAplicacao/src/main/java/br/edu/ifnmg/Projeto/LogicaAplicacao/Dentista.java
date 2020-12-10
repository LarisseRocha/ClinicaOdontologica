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
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author larisse
 */
@Entity
@Table(name = "Dentista")
@DiscriminatorValue(value = "1")
public class Dentista extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
      
    @Column(length = 250, nullable = false, unique = true)
    private String cpf;
    
    @Column(length = 250, nullable = false)
    private String rg;
    
    @Column(length = 250, nullable = false)
    private String Registro;
    
   @Version
   private int version;

    public Dentista() {
        super();
        this.setTipo(PessoaTipo.Dentista);
        this.cpf = "";
        this.rg = "";
        this.Registro = "";
        this.version = 1;
    }

    public Dentista(String nome, String cpf, String rg, String CRO) {
        super();
        this.setTipo(PessoaTipo.Dentista);
        this.setNome(nome);
        this.cpf = cpf;
        this.rg = rg;
        this.Registro = CRO;
        this.version = 1;
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
        return Registro;
    }

    public void setCRO(String CRO) {
        this.Registro = CRO;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.cpf);
        hash = 67 * hash + Objects.hashCode(this.Registro);
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
        return Objects.equals(this.Registro, other.Registro);
    }

    @Override
    public String toString() {
        return cpf;
    }
    
}
