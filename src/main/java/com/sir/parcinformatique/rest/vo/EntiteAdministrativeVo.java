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
public class EntiteAdministrativeVo {
    private Long id;
    private String libelle;
    private RattachementVo rattachementVo;
    private List<LocaleVo> localeVos;
    private List<ResponsableVo> responsableVos;
    private List<UserVo> userVos;

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

    public RattachementVo getRattachementVo() {
        return rattachementVo;
    }

    public void setRattachementVo(RattachementVo rattachementVo) {
        this.rattachementVo = rattachementVo;
    }

    public List<LocaleVo> getLocaleVos() {
        return localeVos;
    }

    public void setLocaleVos(List<LocaleVo> localeVos) {
        this.localeVos = localeVos;
    }

    public List<ResponsableVo> getResponsableVos() {
        return responsableVos;
    }

    public void setResponsableVos(List<ResponsableVo> responsableVos) {
        this.responsableVos = responsableVos;
    }

    public List<UserVo> getUserVos() {
        return userVos;
    }

    public void setUserVos(List<UserVo> userVos) {
        this.userVos = userVos;
    }
    
    
}
