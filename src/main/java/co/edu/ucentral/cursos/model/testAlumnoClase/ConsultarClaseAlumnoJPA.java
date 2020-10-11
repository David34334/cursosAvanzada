package co.edu.ucentral.cursos.model.testAlumnoClase;

import co.edu.ucentral.cursos.model.Alumno_Clase;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ConsultarClaseAlumnoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        // Inicio de transacción con la DB
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Alumno_Clase alumno = manager.find(Alumno_Clase.class, 1);
        tx.commit();
        log.debug("Alumno: " + alumno);
        manager.close();
    }

}
