package co.edu.ucentral.cursos.model.testPatronesSingleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {
    
    private static EntityManagerFactory emf = null;
    
    private Conexion() {
        
    }
    
    public static EntityManagerFactory getInstancia() {
        if(Conexion.emf == null) {
            emf = Persistence.createEntityManagerFactory("CursosUP");
        }
        return emf;
    }
    
    
}
