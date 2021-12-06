package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.DetalleInscripcion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-06T13:26:59")
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile SingularAttribute<Materia, String> descripcion;
    public static volatile SingularAttribute<Materia, Integer> id;
    public static volatile SingularAttribute<Materia, String> nombre;
    public static volatile SingularAttribute<Materia, Boolean> activa;
    public static volatile ListAttribute<Materia, DetalleInscripcion> detalleInscripcionList;

}