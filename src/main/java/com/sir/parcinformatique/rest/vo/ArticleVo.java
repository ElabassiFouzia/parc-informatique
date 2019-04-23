/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.vo;

import java.io.Serializable;


/**
 *
 * @author Ibtissam
 */

public class ArticleVo implements Serializable {

    
    private Long id;
    private String operation;
    private String dateInvention;
    private String codeBarre;
    private String numeroSerie;
    private String numeroMarche;
    private String observation;
    
    private SousFamilleVo sousFamilleVo;
    private ModelVo modelVo;
    private LocaleVo localeVo;
    private ResponsableVo responsableVo;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getDateInvention() {
        return dateInvention;
    }

    public void setDateInvention(String dateInvention) {
        this.dateInvention = dateInvention;
    }

    public String getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(String codeBarre) {
        this.codeBarre = codeBarre;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getNumeroMarche() {
        return numeroMarche;
    }

    public void setNumeroMarche(String numeroMarche) {
        this.numeroMarche = numeroMarche;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public SousFamilleVo getSousFamilleVo() {
        return sousFamilleVo;
    }

    public void setSousFamilleVo(SousFamilleVo sousFamilleVo) {
        this.sousFamilleVo = sousFamilleVo;
    }

    public ModelVo getModelVo() {
        return modelVo;
    }

    public void setModelVo(ModelVo modelVo) {
        this.modelVo = modelVo;
    }

    public LocaleVo getLocaleVo() {
        return localeVo;
    }

    public void setLocaleVo(LocaleVo localeVo) {
        this.localeVo = localeVo;
    }

    public ResponsableVo getResponsableVo() {
        return responsableVo;
    }

    public void setResponsableVo(ResponsableVo responsableVo) {
        this.responsableVo = responsableVo;
    }

    
    
   
}
