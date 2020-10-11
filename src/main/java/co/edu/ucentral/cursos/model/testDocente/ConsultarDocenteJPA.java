package co.edu.ucentral.cursos.model.testDocente;

import co.edu.ucentral.cursos.model.Docentes;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ConsultarDocenteJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        // Inicio de transacción con la DB
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Docentes docente = manager.find(Docentes.class, 1);
        tx.commit();
        log.debug("Docente: " + docente);
        manager.close();
    }

}
