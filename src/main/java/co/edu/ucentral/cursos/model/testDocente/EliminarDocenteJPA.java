package co.edu.ucentral.cursos.model.testDocente;

import co.edu.ucentral.cursos.model.Docentes;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class EliminarDocenteJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Docentes docente = manager.find(Docentes.class, 1111);
        manager.remove(manager.merge(docente));
        tx.commit();
        log.debug("Docente Elimindo: " + docente);
        manager.close();
    }

}
