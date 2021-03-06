/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto.LogicaAplicacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 *
 * @author larisse
 */
@Entity
@Table(name = "atendimentos")
public class Atendimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dtVisita;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private StatusAtendimento status;
    
    @Column(precision = 8, scale = 2)
    private BigDecimal valorTotal;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            mappedBy = "atendimento")
    private List<AtendimentoItens> itens;
    
    @Version
    private int version;
    
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Usuario usuario;
    
    
    public Atendimento() {
        
        this.id = 0L;
        this.pessoa = null;
        this.valorTotal = new BigDecimal("0.00");
        this.status = StatusAtendimento.Agendado;
        this.dtVisita = new Date();
        this.itens = new ArrayList<>();
        this.version = 1;
    }

    public Atendimento(Pessoa pessoa, StatusAtendimento status, Usuario usuario) {
        this.id = 0L;
        this.pessoa = pessoa;
        this.valorTotal = new BigDecimal("0.00");
        this.status = status;
        this.dtVisita = new Date();
        this.itens = new ArrayList<>();
        this.version = 1; 
        this.usuario = usuario;
    }

    public Usuario getUser() {
        return usuario;
    }

    public void setUser(Usuario user) {
        this.usuario = user;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDtVisita() {
        return dtVisita;
    }

    public void setDtVisita(Date dtVisita) {
        this.dtVisita = dtVisita;
    }

    public StatusAtendimento getStatus() {
        return status;
    }

    public void setStatus(StatusAtendimento status) {
        this.status = status;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<AtendimentoItens> getItens() {
        return itens;
    }

    public void setItens(List<AtendimentoItens> itens) {
        this.itens = itens;
    }
    
   

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    
     public boolean add(AtendimentoItens itens){
        itens.setAtendimento(this);
        if(! this.itens.contains(itens)){
            this.itens.add(itens);
            this.valorTotal = this.valorTotal.add(
                   itens.getValor().multiply(BigDecimal.valueOf(itens.getQuantidade())));
            return true;
        }
        return false;
    }
    
    public boolean remove(AtendimentoItens itens){
        if(this.itens.contains(itens)){
            this.itens.remove(itens);
            this.valorTotal = this.valorTotal.subtract(
                    itens.getValor().multiply(BigDecimal.valueOf(itens.getQuantidade())));
            return true;
        }
        return false;
    }

    
    /*public boolean remove(AtendimentoServico item){
        if(this.itens.remove(item));
        this.valorTotal = this.valorTotal.subtract(item.getValor().
                multiply(BigDecimal.valueOf(item.getQuantidade())));
            return true;
    }*/
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atendimento)) {
            return false;
        }
        Atendimento other = (Atendimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.id.toString();
    }

}
