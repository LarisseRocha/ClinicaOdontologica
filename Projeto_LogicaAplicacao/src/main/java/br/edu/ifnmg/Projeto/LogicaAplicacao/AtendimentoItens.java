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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author larisse
 */
@Entity
@Table(name = "atendimentoitens")
public class AtendimentoItens implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "atendimento_id", nullable = false) 
    private Atendimento atendimento;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "servico_id", nullable = false)
    private Servico servico;
    
    private int quantidade;
    
    //O valor do serviço é alterado ao longo do tempo, é necessário manter o histórico, por isso também deve ser declarado aqui
    @Column(precision = 8, scale = 2)
    private BigDecimal valor;
    
  
    public AtendimentoItens() {
               
        this.atendimento = null;       
        this.servico = null;
        this.quantidade = 0;
        this.valor = new BigDecimal("0.00");
       
    }

    public AtendimentoItens(Servico servico, int quantidade) {
        this.servico = servico;
        this.quantidade = quantidade;
        this.valor = servico.getValor();      
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
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
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
        final AtendimentoItens other = (AtendimentoItens) obj;
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
        return "atendimentoItens";
    }
    
   // String.valueOf(this.atendimento)+(String.valueOf(this.servico))
   
}
