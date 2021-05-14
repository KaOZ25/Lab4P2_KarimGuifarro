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
public class consultores extends Empleados{
   private int tiempo_consulta;
   private String campo_exp;

    public consultores(int tiempo_consulta, String campo_exp, String nombre, String apellido, String ID, String nacionalidad, int años_contrato, int sueldo_mensual, int poyectos_realizados) {
        super(nombre, apellido, ID, nacionalidad, años_contrato, sueldo_mensual, poyectos_realizados);
        this.tiempo_consulta = tiempo_consulta;
        this.campo_exp = campo_exp;
    }

    public int getTiempo_consulta() {
        return tiempo_consulta;
    }

    public void setTiempo_consulta(int tiempo_consulta) {
        this.tiempo_consulta = tiempo_consulta;
    }

    public String getCampo_exp() {
        return campo_exp;
    }

    public void setCampo_exp(String campo_exp) {
        this.campo_exp = campo_exp;
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
        return "consultores{" + "tiempo_consulta=" + tiempo_consulta + ", campo_exp=" + campo_exp + super.toString()+'}';
    }
   
}
