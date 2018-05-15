/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SOTO
 */
public class Oferente extends Usuario {
    
    //atributos
    private String id;
    private String apellido;
    private String nacionalidad;
    private String residencia; //DIRECCION

    public Oferente(String id, String apellido, String nacionalidad, String residencia, 
            String nombre, String clave, String telefono, String correo, String nombreUsuario) {
        super(nombre, clave, telefono, correo, nombreUsuario);
        this.id = id;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.residencia = residencia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
    
    
    
    
    
    
}
