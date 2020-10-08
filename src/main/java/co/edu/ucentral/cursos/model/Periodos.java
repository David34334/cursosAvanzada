package co.edu.ucentral.cursos.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "periodos")
public class Periodos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre_periodo;
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    @Temporal(TemporalType.DATE)
    private Date fecha_final;

    
    public Periodos() {
        this.fecha_inicio = new Date();
        this.fecha_final = new Date();
    }

    public Periodos(String nombrePeriodo, Date fechaInicio, Date fechaFinal) {
        this.nombre_periodo = nombrePeriodo;
        this.fecha_inicio = fechaInicio;
        this.fecha_final = fechaFinal;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_periodo() {
        return nombre_periodo;
    }

    public void setNombre_periodo(String nombre_periodo) {
        this.nombre_periodo = nombre_periodo;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    @Override
    public String toString() {
        return "Periodos{" + "nombrePeriodo=" + nombre_periodo + ", fechaInicio=" + fecha_inicio + ", fechaFinal=" + fecha_final + '}';
    }

}