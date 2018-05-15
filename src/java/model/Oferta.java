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
public class Oferta {
    
    //jfjhfhdgfgfhdgfgdgfjhdfjhjcksjdljsodh
     //atributos
    private Empresa _empresa;
    private Oferente _oferente;
    private int numeroConsecutivo; //para levar un control numerico

    //////////////////////////////////////////////

    public Oferta(Empresa _empresa, Oferente _oferente) {
        this._empresa = _empresa;
        this._oferente = _oferente;
        //
    }
    
    public Empresa getEmpresa() {
        return _empresa;
    }

    public void setEmpresa(Empresa _empresa) {
        this._empresa = _empresa;
    }

    public Oferente getOferente() {
        return _oferente;
    }

    public void setOferente(Oferente _oferente) {
        this._oferente = _oferente;
    }

    public int getNumeroConsecutivo() {
        return numeroConsecutivo;
    }
}
