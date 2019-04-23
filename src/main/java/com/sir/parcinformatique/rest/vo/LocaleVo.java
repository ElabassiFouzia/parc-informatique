/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.vo;


/**
 *
 * @author SAMSUNG
 */
public class LocaleVo {
    private Long id;
    private String libelle;
    private EntiteAdministrativeVo entiteAdministrativeVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public EntiteAdministrativeVo getEntiteAdministrativeVo() {
        return entiteAdministrativeVo;
    }

    public void setEntiteAdministrativeVo(EntiteAdministrativeVo entiteAdministrativeVo) {
        this.entiteAdministrativeVo = entiteAdministrativeVo;
    }
    

    
}
