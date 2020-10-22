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
@Table(name = "clases")
public class Clases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_docente")
    private Docentes id_docente;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_periodo")
    private Periodos id_periodo;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_curso")
    private Cursos id_curso;
    
    
    public Clases() {
        
    }

    public Clases(Docentes docente, Periodos periodo, Cursos curso) {
        this.id_docente = docente;
        this.id_periodo = periodo;
        this.id_curso = curso;
    }
        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Docentes getId_docente() {
        return id_docente;
    }

    public void setId_docente(Docentes id_docente) {
        this.id_docente = id_docente;
    }

    public Periodos getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(Periodos id_periodo) {
        this.id_periodo = id_periodo;
    }

    public Cursos getId_curso() {
        return id_curso;
    }

    public void setId_curso(Cursos id_curso) {
        this.id_curso = id_curso;
    }

    @Override
    public String toString() {
        return "Clases{" + "docente=" + id_docente + ", periodo=" + id_periodo + ", curso=" + id_curso + '}';
    }
     
}