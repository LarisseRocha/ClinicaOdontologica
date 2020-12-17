package br.edu.ifnmg.Projeto.LogicaAplicacao;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Usuario;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-17T13:32:39", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Servico.class)
public class Servico_ { 

    public static volatile SingularAttribute<Servico, BigDecimal> valor;
    public static volatile SingularAttribute<Servico, Usuario> usuario;
    public static volatile SingularAttribute<Servico, Long> id;
    public static volatile SingularAttribute<Servico, Integer> version;
    public static volatile SingularAttribute<Servico, String> descricao;

}