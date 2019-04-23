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
public class RoleVo {
    private Long id;
    private String libelle;
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

    public List<UserVo> getUserVos() {
        return userVos;
    }

    public void setUserVos(List<UserVo> userVos) {
        this.userVos = userVos;
    }
    
    
}
