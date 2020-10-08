package co.edu.ucentral.cursos.model.testAlumnoClase;

import co.edu.ucentral.cursos.model.Alumno_Clase;
import co.edu.ucentral.cursos.model.Alumnos;
import co.edu.ucentral.cursos.model.Clases;
import co.edu.ucentral.cursos.model.Periodos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirAlumnoClase {

    static Logger log = (Logger) LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();

        Alumnos alumno = manager.find(Alumnos.class, 1000252139);
        Clases clase = manager.find(Clases.class, 1);
        Alumno_Clase alumno_clase = new Alumno_Clase(alumno, clase, 4);
        manager.persist(alumno_clase);
        tx.commit();
        log.debug("Alumno en Clase: " + alumno_clase);
        manager.close();
    }

}
