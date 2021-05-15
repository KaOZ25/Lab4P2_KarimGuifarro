/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class desarrolladores extends Empleados {
    private int años_exp,horas_trabajo;
    private String lenguaje_fav;

    public desarrolladores() {
    }

    public desarrolladores(int años_exp, int horas_trabajo, String lenguaje_fav, String nombre, String apellido, String ID, String nacionalidad, String user, String contra, int años_contrato, int sueldo_mensual, int poyectos_realizados) {
        super(nombre, apellido, ID, nacionalidad, user, contra, años_contrato, sueldo_mensual, poyectos_realizados);
        this.años_exp = años_exp;
        this.horas_trabajo = horas_trabajo;
        this.lenguaje_fav = lenguaje_fav;
    }

    public int getAños_exp() {
        return años_exp;
    }

    public void setAños_exp(int años_exp) {
        this.años_exp = años_exp;
    }

    public int getHoras_trabajo() {
        return horas_trabajo;
    }

    public void setHoras_trabajo(int horas_trabajo) {
        this.horas_trabajo = horas_trabajo;
    }

    public String getLenguaje_fav() {
        return lenguaje_fav;
    }

    public void setLenguaje_fav(String lenguaje_fav) {
        this.lenguaje_fav = lenguaje_fav;
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getAños_contrato() {
        return años_contrato;
    }

    public void setAños_contrato(int años_contrato) {
        this.años_contrato = años_contrato;
    }

    public int getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(int sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    public int getPoyectos_realizados() {
        return poyectos_realizados;
    }

    public void setPoyectos_realizados(int poyectos_realizados) {
        this.poyectos_realizados = poyectos_realizados;
    }

  

  
    @Override
    public String toString() {
        return  años_exp + " " +horas_trabajo + " " +lenguaje_fav + super.toString();
    }
    
}
