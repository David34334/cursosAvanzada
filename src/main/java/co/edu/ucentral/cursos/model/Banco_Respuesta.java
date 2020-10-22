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
@Table(name = "banco_respuestas")
public class Banco_Respuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codRespuesta")
    private Respuestas codRespuesta;
    
    
    public Banco_Respuesta() {
        
    }

    public Banco_Respuesta(Respuestas codRespuesta) {
        this.codRespuesta = codRespuesta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Respuestas getCodRespuesta() {
        return codRespuesta;
    }

    public void setCodRespuesta(Respuestas codRespuesta) {
        this.codRespuesta = codRespuesta;
    }

    @Override
    public String toString() {
        return "Banco_Respuesta{" + "codRespuesta=" + codRespuesta + '}';
    }
    
}