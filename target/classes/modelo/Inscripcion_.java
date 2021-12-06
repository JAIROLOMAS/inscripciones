package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Alumno;
import modelo.DetalleInscripcion;
import modelo.Periodo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-06T13:26:59")
@StaticMetamodel(Inscripcion.class)
public class Inscripcion_ { 

    public static volatile SingularAttribute<Inscripcion, Periodo> periodo;
    public static volatile SingularAttribute<Inscripcion, String> observaciones;
    public static volatile SingularAttribute<Inscripcion, Alumno> alumno;
    public static volatile SingularAttribute<Inscripcion, Integer> id;
    public static volatile SingularAttribute<Inscripcion, Boolean> pagada;
    public static volatile SingularAttribute<Inscripcion, Date> fechaInscripcion;
    public static volatile ListAttribute<Inscripcion, DetalleInscripcion> detalleInscripcionList;

}