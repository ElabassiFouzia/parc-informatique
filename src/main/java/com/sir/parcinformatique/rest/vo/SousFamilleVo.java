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
public class SousFamilleVo implements Serializable {

   
    private Long id;
    private String libelle;

    private FamilleVo familleVo;

    private List<ArticleVo> articleVos;

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

    public FamilleVo getFamilleVo() {
        return familleVo;
    }

    public void setFamilleVo(FamilleVo familleVo) {
        this.familleVo = familleVo;
    }

    public List<ArticleVo> getArticleVos() {
        return articleVos;
    }

    public void setArticleVos(List<ArticleVo> articleVos) {
        this.articleVos = articleVos;
    }

}
