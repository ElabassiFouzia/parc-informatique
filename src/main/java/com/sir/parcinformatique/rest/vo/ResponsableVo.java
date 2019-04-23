/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.vo;

import java.util.List;



/**
 *
 * @author SAMSUNG
 */
public class ResponsableVo {
 
    private Long id;
    private String nomPrenom;
    private String matricule;
    private String poste;
    private EntiteAdministrativeVo entiteAdministrativeVo;
    private List<ArticleVo> articleVos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomPrenom() {
        return nomPrenom;
    }

    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public EntiteAdministrativeVo getEntiteAdministrativeVo() {
        return entiteAdministrativeVo;
    }

    public void setEntiteAdministrativeVo(EntiteAdministrativeVo entiteAdministrativeVo) {
        this.entiteAdministrativeVo = entiteAdministrativeVo;
    }

    public List<ArticleVo> getArticleVos() {
        return articleVos;
    }

    public void setArticleVos(List<ArticleVo> articleVos) {
        this.articleVos = articleVos;
    }

    
}
