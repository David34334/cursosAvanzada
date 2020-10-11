package co.edu.ucentral.cursos.model.testClases;

import co.edu.ucentral.cursos.model.Clases;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class EliminarClasesJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Clases clase = manager.find(Clases.class, 2);
        manager.remove(manager.merge(clase));
        tx.commit();
        log.debug("Clase Eliminada: " + clase);
        manager.close();
    }
}
