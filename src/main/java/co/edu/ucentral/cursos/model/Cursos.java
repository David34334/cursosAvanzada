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
@Table(name = "cursos")
public class Cursos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre_curso;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_departamento")
    private Departamentos id_departamento;

    public Cursos() {

    }

    public Cursos(String nombre_curso, Departamentos id_departamento) {
        this.nombre_curso = nombre_curso;
        this.id_departamento = id_departamento;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public Departamentos getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(Departamentos id_departamento) {
        this.id_departamento = id_departamento;
    }

    @Override
    public String toString() {
        return "Cursos{" + "nombre_curso=" + nombre_curso + ", id_departamento=" + id_departamento + '}';
    }

}