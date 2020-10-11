package co.edu.ucentral.cursos.model.testAlumno;

import co.edu.ucentral.cursos.model.Alumnos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ActualizarAlumnoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Alumnos alumno = manager.find(Alumnos.class, 1000252139);
        log.debug("Alumno Recuperado: " + alumno);
        alumno.setTelefono("1234567");
        tx.commit();
        log.debug("Alumno Actualizado: " + alumno);
        manager.close();

    }

}
