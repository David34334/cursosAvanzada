package co.edu.ucentral.cursos.model.testDocente;

import co.edu.ucentral.cursos.model.Docentes;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ActualizarDocenteJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Docentes docentes = manager.find(Docentes.class, 45454545);
        log.debug("Docente Recuperado: " + docentes);
        docentes.setNombre("Juan");
        tx.commit();
        log.debug("Docente Actualizado: " + docentes);
        manager.close();
    }
    
}
