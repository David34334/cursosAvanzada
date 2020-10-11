package co.edu.ucentral.cursos.model.testAlumno;

import co.edu.ucentral.cursos.model.Alumnos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class EliminarAlumnoJPA {

    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Alumnos alumno = manager.find(Alumnos.class, 2323232);
        manager.remove(manager.merge(alumno));
        tx.commit();
        log.debug("Alumno Elimindo: " + alumno);
        manager.close();
    }
    
}
