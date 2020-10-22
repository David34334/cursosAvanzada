package co.edu.ucentral.cursos.model.testPatronesFactoria;

import co.edu.ucentral.cursos.model.testPatronesSingleton.Conexion;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class TestFactoriaPatron {

    static Logger log = (Logger) LogManager.getRootLogger();

    public static void main(String[] args) {
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManagerFactory emf = Conexion.getInstancia();
        EntityManager manager = emf.createEntityManager();
        //Inicio de Transacción
        EntityTransaction tx = manager.getTransaction();

        FactoriaCrearMiembro fcm = new FactoriaCrearMiembro();
        CrearMiembro cm = fcm.getMiembro("Alumno");
        cm.CrearMiembro(123, "foto_alumno.png", "Juan", "Ramirez", 'M', "11111");
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
