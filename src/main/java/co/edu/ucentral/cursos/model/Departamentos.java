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
@Table (name = "departamentos")
public class Departamentos implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre_departamento;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codFacultad")
    private Facultades codFacultad;
    
    public Departamentos() {
        
    }

    public Departamentos(String nombre_departamento, Facultades facultad) {
        this.nombre_departamento = nombre_departamento;
        this.codFacultad = facultad;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }

    public Facultades getCodFacultad() {
        return codFacultad;
    }

    public void setCodFacultad(Facultades codFacultad) {
        this.codFacultad = codFacultad;
    }

    @Override
    public String toString() {
        return "Departamentos{" + "nombre_departamento=" + nombre_departamento + ", facultad=" + codFacultad + '}';
    }

}
