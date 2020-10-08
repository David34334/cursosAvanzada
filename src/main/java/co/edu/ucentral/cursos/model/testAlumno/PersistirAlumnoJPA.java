package co.edu.ucentral.cursos.model.testAlumno;

import co.edu.ucentral.cursos.model.Alumnos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirAlumnoJPA {
    
    static Logger log = (Logger) LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        //Inicio de Transacción
        EntityTransaction tx = manager.getTransaction();
        
        //Se crea el Alumno
        Alumnos alumno = new Alumnos(1000252139, "foto_alumno.png", "David", "Acosta", 'M', "33434343");
        //Se inicia la transacción
        tx.begin();
        //Se ejecuta el SQL
        manager.persist(alumno);
        //Commit - Rollback
        tx.commit();
        log.debug("Alumno Persistido: " + alumno);
        manager.close();
        
    }
    
}
