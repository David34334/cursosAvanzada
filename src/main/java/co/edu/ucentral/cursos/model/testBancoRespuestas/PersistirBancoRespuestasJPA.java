package co.edu.ucentral.cursos.model.testBancoRespuestas;

import co.edu.ucentral.cursos.model.Banco_Respuesta;
import co.edu.ucentral.cursos.model.Respuestas;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirBancoRespuestasJPA {

    static Logger log = (Logger) LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        //Inicio de Transacción
        EntityTransaction tx = manager.getTransaction();

        //Se crea el Alumno
        Respuestas respuesta = manager.find(Respuestas.class, 2);
        Banco_Respuesta almacenarRespuesta = new Banco_Respuesta(respuesta);
        //Se inicia la transacción
        tx.begin();
        //Se ejecuta el SQL
        manager.persist(almacenarRespuesta);
        //Commit - Rollback
        tx.commit();
        log.debug("Respuesta Persistida: " + almacenarRespuesta);
        manager.close();

    }

}
