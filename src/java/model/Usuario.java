/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



public class Usuario {
    
    //atributos
    private String nombre;
    private String nombreUsuario;
    private String clave;
    private String telefono;
    private String correo;

    public Usuario(String nombre, String clave, String telefono, String correo, String nombreUsuario) {
        this.nombre = nombre;
        this.clave = clave;
        this.telefono = telefono;
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    
    
   
    
    
}
