package co.edu.ucentral.cursos.model.testFacultad;

import co.edu.ucentral.cursos.model.Facultades;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ActualizarFacultadJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Facultades facultad = manager.find(Facultades.class, 1);
        log.debug("Facultad Recuperada: " + facultad);
        facultad.setNombre_facultad("Facultad Ingeniería y Ciencias Básicas");
        tx.commit();
        log.debug("Facultad Actualizada: " + facultad);
        manager.close();
    }
    
}
