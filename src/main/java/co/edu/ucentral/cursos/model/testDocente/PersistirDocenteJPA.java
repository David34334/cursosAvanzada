package co.edu.ucentral.cursos.model.testDocente;

import co.edu.ucentral.cursos.model.Docentes;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirDocenteJPA {

    static Logger log = (Logger) LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        //Inicio de Transacción
        EntityTransaction tx = manager.getTransaction();
        
        //Se crea el Docente
        Docentes docente = new Docentes(45454545, "docente.png", "Juan", "Prueba", 'M', "565656");
        //Se inicia la transacción
        tx.begin();
        //Se ejecuta el SQL
        manager.persist(docente);
        //Commit - Rollback
        tx.commit();
        log.debug("Alumno Persistido: " + docente);
        manager.close();
        
    }
    
}
