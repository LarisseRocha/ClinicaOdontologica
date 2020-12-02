/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.LogicaAplicacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author larisse
 */
@Entity
@Table(name = "AtendimentoServico")
public class AtendimentoServico implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "atendimento_id", nullable = false) 
    private Atendimento atendimento;
    
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    
    @Column(precision = 9, scale = 2)
    private BigDecimal valor;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "servico_id", nullable = false)
    private Servico servico;

    public AtendimentoServico() {
        
        this.atendimento = null;
        this.quantidade = 0;
        this.servico = null;
        this.valor = new BigDecimal("0.00");
       
    }

    public AtendimentoServico(Servico servico, int quantidade) {
        this.servico = servico;
        this.quantidade = quantidade;
      //  this.valor = this.servico.getValor();
        
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.atendimento);
        hash = 79 * hash + this.quantidade;
        hash = 79 * hash + Objects.hashCode(this.servico);
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
        final AtendimentoServico other = (AtendimentoServico) obj;
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.atendimento, other.atendimento)) {
            return false;
        }
        if (!Objects.equals(this.servico, other.servico)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return String.valueOf(this.atendimento)+(String.valueOf(this.servico));
    }
    
    
   
}
