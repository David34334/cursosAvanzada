package co.edu.ucentral.cursos.model.testPatronesFactoria;

public class FactoriaCrearMiembro {

    public CrearMiembro getMiembro(String tipo) {
        CrearMiembro cm = null;
        if(tipo.equals("Alumno")) {
            cm = new MiembroEstudiante();
        } else
            if(tipo.equals("Docente")) {
                cm = new MiembroDocente();
            }
        
        return cm;
    }
    
}
