package co.edu.ucentral.cursos.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "evaluaciones")
public class Evaluaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomEvaluacion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idAlumnoClase")
    private Alumno_Clase idAlumnoClase;

    
    public Evaluaciones() {
        
    }
    
    
    public Evaluaciones(String nomEvaluacion, Alumno_Clase idAlumnoClase) {
        this.nomEvaluacion = nomEvaluacion;
        this.idAlumnoClase = idAlumnoClase;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomEvaluacion() {
        return nomEvaluacion;
    }

    public void setNomEvaluacion(String nomEvaluacion) {
        this.nomEvaluacion = nomEvaluacion;
    }

    public Alumno_Clase getIdAlumnoClase() {
        return idAlumnoClase;
    }

    public void setIdAlumnoClase(Alumno_Clase idAlumnoClase) {
        this.idAlumnoClase = idAlumnoClase;
    }

    @Override
    public String toString() {
        return "Evaluaciones{" + "nomEvaluacion=" + nomEvaluacion + ", idAlumnoClase=" + idAlumnoClase + '}';
    }

    
}
