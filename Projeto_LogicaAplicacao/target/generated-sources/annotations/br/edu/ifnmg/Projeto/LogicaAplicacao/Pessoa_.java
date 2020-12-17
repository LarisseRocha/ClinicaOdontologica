package br.edu.ifnmg.Projeto.LogicaAplicacao;

import br.edu.ifnmg.Projeto.LogicaAplicacao.PessoaTipo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-17T13:32:39", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, PessoaTipo> tipo;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, Long> id;
    public static volatile SingularAttribute<Pessoa, Integer> version;

}