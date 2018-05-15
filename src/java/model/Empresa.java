/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author SOTO
 */
public class Empresa extends Usuario {
    
    
    //atributos 
    private String descripcion; //del perfil
    private List<Oferta> ofertas;

    public Empresa(String descripcion, List<Oferta> ofertas, String nombre, String clave, String telefono, String correo, String nombreUsuario) {
        super(nombre, clave, telefono, correo, nombreUsuario);
        this.descripcion = descripcion;
        this.ofertas = ofertas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }
    
    
}
