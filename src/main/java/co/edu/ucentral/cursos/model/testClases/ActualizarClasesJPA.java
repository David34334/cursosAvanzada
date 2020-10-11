package co.edu.ucentral.cursos.model.testClases;

import co.edu.ucentral.cursos.model.Clases;
import co.edu.ucentral.cursos.model.Periodos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ActualizarClasesJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Clases clase = manager.find(Clases.class, 1);
        Periodos periodo = manager.find(Periodos.class, 2);
        log.debug("Clase Recuperada: " + clase);
        clase.setId_periodo(periodo);
        tx.commit();
        log.debug("Clase Actualizada: " + clase);
        manager.close();
    }

}
