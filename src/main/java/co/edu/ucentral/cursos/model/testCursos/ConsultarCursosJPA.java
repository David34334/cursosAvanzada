package co.edu.ucentral.cursos.model.testCursos;

import co.edu.ucentral.cursos.model.Cursos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ConsultarCursosJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        // Inicio de transacción con la DB
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Cursos curso = manager.find(Cursos.class, 1);
        tx.commit();
        log.debug("Curso: " + curso);
        manager.close();
    }
    
}
