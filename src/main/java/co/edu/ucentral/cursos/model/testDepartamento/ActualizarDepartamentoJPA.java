package co.edu.ucentral.cursos.model.testDepartamento;

import co.edu.ucentral.cursos.model.Departamentos;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ActualizarDepartamentoJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursosUP");
        EntityManager manager = emf.createEntityManager();
        
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Departamentos departamento = manager.find(Departamentos.class, 1);
        log.debug("Departamento Recuperado: " + departamento);
        departamento.setNombre_departamento("Departamento Matemáticas");
        tx.commit();
        log.debug("Departamento Actualizado: " + departamento);
        manager.close();
    }
    
}
