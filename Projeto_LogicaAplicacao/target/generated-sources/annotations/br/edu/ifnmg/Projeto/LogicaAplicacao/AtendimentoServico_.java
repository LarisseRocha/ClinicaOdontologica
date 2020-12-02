package br.edu.ifnmg.Projeto.LogicaAplicacao;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Atendimento;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Servico;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-02T01:29:07", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(AtendimentoServico.class)
public class AtendimentoServico_ { 

    public static volatile SingularAttribute<AtendimentoServico, BigDecimal> valor;
    public static volatile SingularAttribute<AtendimentoServico, Atendimento> atendimento;
    public static volatile SingularAttribute<AtendimentoServico, Servico> servico;
    public static volatile SingularAttribute<AtendimentoServico, Integer> quantidade;

}