/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_karimguifarro;

public class Empleados {
    String nombre,apellido,ID,nacionalidad,user,contra;
    int años_contrato,sueldo_mensual,poyectos_realizados;

    public Empleados() {
    }

    public Empleados(String nombre, String apellido, String ID, String nacionalidad, String user, String contra, int años_contrato, int sueldo_mensual, int poyectos_realizados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.nacionalidad = nacionalidad;
        this.user = user;
        this.contra = contra;
        this.años_contrato = años_contrato;
        this.sueldo_mensual = sueldo_mensual;
        this.poyectos_realizados = poyectos_realizados;
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
        return  nombre + " " +apellido + " " + ID + " "+ nacionalidad + " "+ user + " " +contra + " " +años_contrato + " " +sueldo_mensual + " " +poyectos_realizados ;
    }

    
}
