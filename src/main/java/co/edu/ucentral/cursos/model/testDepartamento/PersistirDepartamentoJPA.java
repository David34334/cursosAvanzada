package co.edu.ucentral.cursos.model.testDepartamento;

import co.edu.ucentral.cursos.model.Departamentos;
import co.edu.ucentral.cursos.model.Facultades;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirDepartamentoJPA {

    static Logger log = (Logger) LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        //Inicio de Transacción
        EntityTransaction tx = manager.getTransaction();

        //Se crea el Docente
        Facultades facultad = manager.find(Facultades.class, 1);
        Departamentos departamento = new Departamentos("Departamento Física", facultad);
        //Se inicia la transacción
        tx.begin();
        //Se ejecuta el SQL
        manager.persist(departamento);
        //Commit - Rollback
        tx.commit();
        log.debug("Alumno Persistido: " + departamento);
        manager.close();

    }

}
