package co.edu.ucentral.cursos.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "docentes")
public class Docentes implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    private int cedula;
    private String foto;
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;
    private char genero;
    private String telefono;
    
    
    public Docentes() {
        this.fecha_nacimiento = new Date();
    }

    public Docentes(int cedula, String fotoDocente, String nombreDocente, String apellidoDocente, char generoDocente, String telefonoDocente) {
        this.cedula = cedula;
        this.foto = fotoDocente;
        this.nombre = nombreDocente;
        this.apellido = apellidoDocente;
        this.fecha_nacimiento = new Date();
        this.genero = generoDocente;
        this.telefono = telefonoDocente;
    }
    
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Docentes{" + "cedula=" + cedula + ", fotoDocente=" + foto + ", nombreDocente=" + nombre + ", apellidoDocente=" + apellido + ", fechNacimientoDocente=" + fecha_nacimiento + ", generoDocente=" + genero + ", telefonoDocente=" + telefono + '}';
    }

    
}
