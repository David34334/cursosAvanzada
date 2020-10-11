package co.edu.ucentral.cursos.model.testCursos;

import co.edu.ucentral.cursos.model.Cursos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class EliminarCursosJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Cursos cursos = manager.find(Cursos.class, 2);
        manager.remove(manager.merge(cursos));
        tx.commit();
        log.debug("Curso Eliminado: " + cursos);
        manager.close();
    }

}
