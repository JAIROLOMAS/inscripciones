package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Inscripcion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-06T13:26:59")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, String> apellidos;
    public static volatile SingularAttribute<Alumno, Date> fechaNacimiento;
    public static volatile SingularAttribute<Alumno, String> genero;
    public static volatile ListAttribute<Alumno, Inscripcion> inscripcionList;
    public static volatile SingularAttribute<Alumno, String> documento;
    public static volatile SingularAttribute<Alumno, String> ocupacion;
    public static volatile SingularAttribute<Alumno, Integer> id;
    public static volatile SingularAttribute<Alumno, String> email;
    public static volatile SingularAttribute<Alumno, String> nombres;

}