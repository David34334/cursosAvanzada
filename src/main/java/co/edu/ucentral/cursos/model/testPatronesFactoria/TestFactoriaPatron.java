package co.edu.ucentral.cursos.model.testPatronesFactoria;

import javax.persistence.*;
import org.apache.logging.log4j.*;

public class TestFactoriaPatron {

    static Logger log = (Logger) LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        //Inicio de Transacción
        EntityTransaction tx = manager.getTransaction();

        FactoriaCrearMiembro fcm = new FactoriaCrearMiembro();
        CrearMiembro cm = fcm.getMiembro("Docente");
        cm.CrearMiembro(12345, "foto_prueba.png", "Prueba", "Factoria", 'M', "34343434");
        System.out.println("Alumno Creado: " + cm);

        //Se inicia la transacción
        tx.begin();
        //Se ejecuta el SQL
        manager.persist(cm);
        //Commit - Rollback
        tx.commit();
        log.debug("Alumno Persistido: " + cm);
        manager.close();

    }

}
