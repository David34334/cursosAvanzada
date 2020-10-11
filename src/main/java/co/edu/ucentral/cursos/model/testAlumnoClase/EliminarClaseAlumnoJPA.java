package co.edu.ucentral.cursos.model.testAlumnoClase;

import co.edu.ucentral.cursos.model.Alumno_Clase;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class EliminarClaseAlumnoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Alumno_Clase alumno = manager.find(Alumno_Clase.class, 2);
        manager.remove(manager.merge(alumno));
        tx.commit();
        log.debug("Alumno Elimindo: " + alumno);
        manager.close();
    }

}
