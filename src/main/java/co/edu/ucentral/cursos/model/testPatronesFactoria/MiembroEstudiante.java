package co.edu.ucentral.cursos.model.testPatronesFactoria;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "alumnos")
public class MiembroEstudiante implements CrearMiembro, Serializable {

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

    public MiembroEstudiante() {
        this.fecha_nacimiento = new Date();
    }

    @Override
    public void CrearMiembro(int cedula, String foto, String nombre, String apellido, char genero, String telefono) {
        this.cedula = cedula;
        this.foto = foto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = new Date();
        this.genero = genero;
        this.telefono = telefono;
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
        return "MiembroEstudiante{" + "cedula=" + cedula + ", foto=" + foto + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento=" + fecha_nacimiento + ", genero=" + genero + ", telefono=" + telefono + '}';
    }


}
