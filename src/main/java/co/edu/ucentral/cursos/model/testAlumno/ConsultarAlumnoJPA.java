package co.edu.ucentral.cursos.model.testAlumno;

import co.edu.ucentral.cursos.model.Alumnos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ConsultarAlumnoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        // Inicio de transacción con la DB
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Alumnos alumno = manager.find(Alumnos.class, 1);
        tx.commit();
        log.debug("Alumno: " + alumno);
        manager.close();
    }

}
