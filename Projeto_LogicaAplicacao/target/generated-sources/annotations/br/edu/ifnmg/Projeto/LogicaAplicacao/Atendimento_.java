package br.edu.ifnmg.Projeto.LogicaAplicacao;

import br.edu.ifnmg.Projeto.LogicaAplicacao.AtendimentoItens;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Pessoa;
import br.edu.ifnmg.Projeto.LogicaAplicacao.StatusAtendimento;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-08T16:15:20", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Atendimento.class)
public class Atendimento_ { 

    public static volatile SingularAttribute<Atendimento, Date> dtVisita;
    public static volatile ListAttribute<Atendimento, AtendimentoItens> itens;
    public static volatile SingularAttribute<Atendimento, Pessoa> pessoa;
    public static volatile SingularAttribute<Atendimento, BigDecimal> valorTotal;
    public static volatile SingularAttribute<Atendimento, Long> id;
    public static volatile SingularAttribute<Atendimento, Integer> version;
    public static volatile SingularAttribute<Atendimento, Usuario> user;
    public static volatile SingularAttribute<Atendimento, StatusAtendimento> status;

}