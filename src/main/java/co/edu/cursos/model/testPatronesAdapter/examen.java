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
public class examen implements caracteristicasCalificaciones {
    private float calificacion;
    private List preguntas;
    private List respuestas;

    @Override
    public String getPreguntas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRespuestas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCalificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
