package co.edu.ucentral.cursos.model.testFacultad;

import co.edu.ucentral.cursos.model.Facultades;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirFacultadJPA {

    static Logger log = (Logger) LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        //Inicio de Transacción
        EntityTransaction tx = manager.getTransaction();

        //Se crea el Docente
        Facultades facultad = new Facultades("Facultdad Ingeniería");
        //Se inicia la transacción
        tx.begin();
        //Se ejecuta el SQL
        manager.persist(facultad);
        //Commit - Rollback
        tx.commit();
        log.debug("Alumno Persistido: " + facultad);
        manager.close();

    }

}
