/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_karimguifarro;


public class Login {
   private String user;
   private String contrasaña;

    public Login() {
    }

    public Login(String user, String contrasaña) {
        this.user = user;
        this.contrasaña = contrasaña;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasaña() {
        return contrasaña;
    }

    public void setContrasaña(String contrasaña) {
        this.contrasaña = contrasaña;
    }
}
