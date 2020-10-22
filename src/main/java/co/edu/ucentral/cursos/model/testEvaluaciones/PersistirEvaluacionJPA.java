package co.edu.ucentral.cursos.model.testEvaluaciones;

import co.edu.ucentral.cursos.model.Alumno_Clase;
import co.edu.ucentral.cursos.model.Evaluaciones;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirEvaluacionJPA {

    static Logger log = (Logger) LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        //Inicio de Transacción
        EntityTransaction tx = manager.getTransaction();

        //Se crea la Evaluacion
        Alumno_Clase alumno_Clase = manager.find(Alumno_Clase.class, 1);
        Evaluaciones evaluacion = new Evaluaciones("Parcial Primer Corte", alumno_Clase);
        //Se inicia la transacción
        tx.begin();
        //Se ejecuta el SQL
        manager.persist(evaluacion);
        //Commit - Rollback
        tx.commit();
        log.debug("Evaluación Persistida: " + evaluacion);
        manager.close();

    }

}
