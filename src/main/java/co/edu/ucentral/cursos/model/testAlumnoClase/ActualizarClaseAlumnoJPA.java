package co.edu.ucentral.cursos.model.testAlumnoClase;

import co.edu.ucentral.cursos.model.Alumno_Clase;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ActualizarClaseAlumnoJPA {

    static Logger log = (Logger) LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Alumno_Clase alumnoClase = manager.find(Alumno_Clase.class, 1);
        log.debug("Alumno en Clase recuperado: " + alumnoClase);
        //alumnoClase.setCalificacion(3);
        tx.commit();
        log.debug("Alumno en Clase actualizado: " + alumnoClase);
        manager.close();
    }
}
