package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Inscripcion;
import modelo.Materia;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-06T13:26:59")
@StaticMetamodel(DetalleInscripcion.class)
public class DetalleInscripcion_ { 

    public static volatile SingularAttribute<DetalleInscripcion, Inscripcion> inscripcion;
    public static volatile SingularAttribute<DetalleInscripcion, String> observaciones;
    public static volatile SingularAttribute<DetalleInscripcion, Materia> materia;
    public static volatile SingularAttribute<DetalleInscripcion, Integer> id;
    public static volatile SingularAttribute<DetalleInscripcion, Integer> numeroToma;

}