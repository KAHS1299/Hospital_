package org.example;

public class Doctores {

    private int Id_tarjeta;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String Especialidad;
    private String Universidad;


    public Doctores(int Id_tarjeta, String nombre, String apellido, String telefono, String direccion, String Especialidad, String Universidad) {
        this.Id_tarjeta = Id_tarjeta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Especialidad = Especialidad;
        this.Universidad = Universidad;
    }

    public int getId_tarjeta() {
        return Id_tarjeta;
    }

    public void setId_tarjeta(int id_tarjeta) {
        Id_tarjeta = id_tarjeta;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String universidad) {
        Universidad = universidad;
    }

    @Override
    public String toString() {
        return "Doctores{" +
                "Id_tarjeta=" + Id_tarjeta +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", Especialidad='" + Especialidad + '\'' +
                ", Universidad='" + Universidad + '\'' +
                '}';
    }
}
