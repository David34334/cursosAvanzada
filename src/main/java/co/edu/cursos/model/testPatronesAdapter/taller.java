/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.cursos.model.testPatronesAdapter;

import java.util.List;

/**
 *
 * @author b_urb
 */
public class taller implements caracteristicasCalificaciones{
     private float calificacion;
    private List preguntas;
    private List respuestas;

    @Override
    public String getPreguntas() {
        String p = "";
        for (Object pregunta : preguntas) {
            p+= pregunta;
        }
        return p;
    }

    @Override
    public String getRespuestas() {
        String r = "";
        for (Object pregunta : respuestas) {
            r+= pregunta;
        }
        return r;
    }

    @Override
    public String getCalificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
