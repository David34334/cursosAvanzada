package co.edu.ucentral.cursos.model.testCursos;

import co.edu.ucentral.cursos.model.Cursos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirCursosJPA {
    
    static Logger log = (Logger) LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        //Inicio de Transacción
        EntityTransaction tx = manager.getTransaction();

        //Se crea el Docente
        Cursos curso = new Cursos("Matemáticas II");
        //Se inicia la transacción
        tx.begin();
        //Se ejecuta el SQL
        manager.persist(curso);
        //Commit - Rollback
        tx.commit();
        log.debug("Alumno Persistido: " + curso);
        manager.close();

    }
    
}
