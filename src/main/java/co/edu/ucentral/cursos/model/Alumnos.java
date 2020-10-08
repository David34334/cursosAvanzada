package co.edu.ucentral.cursos.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "alumnos")
public class Alumnos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cedula;
    private String foto;
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;
    private char genero;
    private String telefono;

    public Alumnos() {
        this.fecha_nacimiento = new Date();
    }

    public Alumnos(int cedula, String fotoAlumno, String nombreAlumno, String apellidoAlumno, char generoAlumno, String telefonoAlumno) {
        this.cedula = cedula;
        this.foto = fotoAlumno;
        this.nombre = nombreAlumno;
        this.apellido = apellidoAlumno;
        this.fecha_nacimiento = new Date();
        this.genero = generoAlumno;
        this.telefono = telefonoAlumno;
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
        return "Alumnos{" + "cedula=" + cedula + ", fotoAlumno=" + foto + ", nombreAlumno=" + nombre + ", apellidoAlumno=" + apellido + ", fechNacimientoAlumno=" + fecha_nacimiento + ", generoAlumno=" + genero + ", telefonoAlumno=" + telefono + '}';
    }

}