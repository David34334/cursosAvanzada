package co.edu.ucentral.cursos.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alumno_clase")
public class Alumno_Clase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_alumno")
    private Alumnos id_alumno;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_clase")
    private Clases id_clase;
    
    
    public Alumno_Clase() {
        
    }

    public Alumno_Clase(Alumnos alumno, Clases clase) {
        this.id_alumno = alumno;
        this.id_clase = clase;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Alumnos getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Alumnos id_alumno) {
        this.id_alumno = id_alumno;
    }

    public Clases getId_clase() {
        return id_clase;
    }

    public void setId_clase(Clases id_clase) {
        this.id_clase = id_clase;
    }

    @Override
    public String toString() {
        return "Alumno_Clase{" + "alumno=" + id_alumno + ", clase=" + id_clase + '}';
    }
    
}