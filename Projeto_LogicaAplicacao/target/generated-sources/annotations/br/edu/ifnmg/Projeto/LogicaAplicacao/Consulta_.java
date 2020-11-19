package br.edu.ifnmg.Projeto.LogicaAplicacao;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Pessoa;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Servico;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-11-19T01:26:55", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, Pessoa> pessoa;
    public static volatile SingularAttribute<Consulta, BigDecimal> valor;
    public static volatile SingularAttribute<Consulta, Long> id;
    public static volatile SingularAttribute<Consulta, Servico> servico;
    public static volatile SingularAttribute<Consulta, Date> criacao;

}