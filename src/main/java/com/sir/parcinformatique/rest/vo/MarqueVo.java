/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.vo;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author Ibtissam
 */

public class MarqueVo implements Serializable {

    
    private Long id;
    private String libelle;
    
    private List<ModelVo> modelVos;

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

    public List<ModelVo> getModelVos() {
        return modelVos;
    }

    public void setModelVos(List<ModelVo> modelVos) {
        this.modelVos = modelVos;
    }

    
    
    
    
}
