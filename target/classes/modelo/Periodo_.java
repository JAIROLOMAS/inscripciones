package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Inscripcion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-06T13:26:59")
@StaticMetamodel(Periodo.class)
public class Periodo_ { 

    public static volatile SingularAttribute<Periodo, Date> fechaInicio;
    public static volatile ListAttribute<Periodo, Inscripcion> inscripcionList;
    public static volatile SingularAttribute<Periodo, Integer> id;
    public static volatile SingularAttribute<Periodo, String> nombre;
    public static volatile SingularAttribute<Periodo, Date> fechaFin;

}