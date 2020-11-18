package br.edu.ifnmg.Projeto.LogicaAplicacao;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Pessoa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-11-16T01:10:40", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Operacao.class)
public class Venda_ { 

    public static volatile SingularAttribute<Operacao, Pessoa> pessoa;
    public static volatile SingularAttribute<Operacao, BigDecimal> valor;
    public static volatile SingularAttribute<Operacao, Long> id;
    public static volatile SingularAttribute<Operacao, Date> criacao;

}