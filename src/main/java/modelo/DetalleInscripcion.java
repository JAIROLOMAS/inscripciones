/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "detalle_inscripcion")
@NamedQueries({
    @NamedQuery(name = "DetalleInscripcion.findAll", query = "SELECT d FROM DetalleInscripcion d")})
public class DetalleInscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "numero_toma")
    private Integer numeroToma;
    @Column(name = "observaciones")
    private String observaciones;
    @JoinColumn(name = "id_inscripcion", referencedColumnName = "id")
    @ManyToOne
    private Inscripcion inscripcion;
    @JoinColumn(name = "id_materia", referencedColumnName = "id")
    @ManyToOne
    private Materia materia;

    public DetalleInscripcion() {
    }

    public DetalleInscripcion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroToma() {
        return numeroToma;
    }

    public void setNumeroToma(Integer numeroToma) {
        this.numeroToma = numeroToma;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleInscripcion)) {
            return false;
        }
        DetalleInscripcion other = (DetalleInscripcion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DetalleInscripcion[ id=" + id + " ]";
    }
    
}
