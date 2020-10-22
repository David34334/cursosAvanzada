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
@Table(name = "preguntas")
public class Preguntas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomPregunta;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codEvaluacion")
    private Evaluaciones codEvaluacion;
    
    
    
    public Preguntas() {
        
    }

    public Preguntas(String nomPregunta, Evaluaciones codEvaluacion) {
        this.nomPregunta = nomPregunta;
        this.codEvaluacion = codEvaluacion;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomPregunta() {
        return nomPregunta;
    }

    public void setNomPregunta(String nomPregunta) {
        this.nomPregunta = nomPregunta;
    }

    public Evaluaciones getCodEvaluacion() {
        return codEvaluacion;
    }

    public void setCodEvaluacion(Evaluaciones codEvaluacion) {
        this.codEvaluacion = codEvaluacion;
    }

    @Override
    public String toString() {
        return "Preguntas{" + "nomPregunta=" + nomPregunta + ", codEvaluacion=" + codEvaluacion + '}';
    }

}