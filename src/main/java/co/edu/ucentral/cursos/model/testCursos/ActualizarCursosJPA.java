package co.edu.ucentral.cursos.model.testCursos;

import co.edu.ucentral.cursos.model.Cursos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ActualizarCursosJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Cursos curso = manager.find(Cursos.class, 1);
        log.debug("Cursos Recuperado: " + curso);
        curso.setNombre_curso("Algebra Lineal");
        tx.commit();
        log.debug("Curso Actualizado: " + curso);
        manager.close();
    }
    
}
