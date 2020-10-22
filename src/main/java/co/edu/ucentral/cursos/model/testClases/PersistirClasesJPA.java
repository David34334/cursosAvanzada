package co.edu.ucentral.cursos.model.testClases;

import co.edu.ucentral.cursos.model.Clases;
import co.edu.ucentral.cursos.model.Cursos;
import co.edu.ucentral.cursos.model.Departamentos;
import co.edu.ucentral.cursos.model.Docentes;
import co.edu.ucentral.cursos.model.Periodos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirClasesJPA {

    static Logger log = (Logger) LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();

        Docentes docente = manager.find(Docentes.class, 45454545);
        Cursos curso = manager.find(Cursos.class, 1);
        Periodos periodo = manager.find(Periodos.class, 1);
        Clases clase = new Clases(docente, periodo, curso);
        manager.persist(clase);
        tx.commit();
        log.debug("Factura " + clase);
        manager.close();
    }

}
