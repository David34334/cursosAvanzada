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
@Table(name = "respuestas")
public class Respuestas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String respuesta;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codPregunta")
    private Preguntas codPregunta;
    private boolean estadoRespuesta;

    
    public Respuestas() {
        
    }
    
    public Respuestas(String respuesta, Preguntas codPregunta) {
        this.respuesta = respuesta;
        this.codPregunta = codPregunta;
    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Preguntas getCodPregunta() {
        return codPregunta;
    }

    public void setCodPregunta(Preguntas codPregunta) {
        this.codPregunta = codPregunta;
    }

    public boolean isEstadoRespuesta() {
        return estadoRespuesta;
    }

    public void setEstadoRespuesta(boolean estadoRespuesta) {
        this.estadoRespuesta = estadoRespuesta;
    }

    @Override
    public String toString() {
        return "Respuestas{" + "respuesta=" + respuesta + ", codPregunta=" + codPregunta + ", estadoRespuesta=" + estadoRespuesta + '}';
    }

}
