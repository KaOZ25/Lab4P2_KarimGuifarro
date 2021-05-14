
package lab4p2_karimguifarro;

import java.util.ArrayList;

public class proyectos {
   private String nombre,empresa,estado;
   private int duracion;
   private ArrayList<Empleados> emple;

    public proyectos() {
    }

    public proyectos(String nombre, String empresa, String estado, int duracion, ArrayList<Empleados> emple) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.estado = estado;
        this.duracion = duracion;
        this.emple = emple;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Empleados> getEmple() {
        return emple;
    }

    public void setEmple(ArrayList<Empleados> emple) {
        this.emple = emple;
    }

    @Override
    public String toString() {
        return "proyectos{" + "nombre=" + nombre + ", empresa=" + empresa + ", estado=" + estado + ", duracion=" + duracion + ", emple=" + emple + '}';
    }
   
}
