/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.vo;

import com.sir.parcinformatique.bean.EntiteAdministrative;
import com.sir.parcinformatique.bean.Role;


/**
 *
 * @author SAMSUNG
 */
public class UserVo {
    private Long id;
    private String  matricule;
    private String nomPrenom;
    private String password;
    private String poste;
    private String dateModification;
    private RoleVo roleVo;
    private EntiteAdministrativeVo entiteAdministrativeVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNomPrenom() {
        return nomPrenom;
    }

    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getDateModification() {
        return dateModification;
    }

    public void setDateModification(String dateModification) {
        this.dateModification = dateModification;
    }

    public RoleVo getRoleVo() {
        return roleVo;
    }

    public void setRoleVo(RoleVo roleVo) {
        this.roleVo = roleVo;
    }

    public EntiteAdministrativeVo getEntiteAdministrativeVo() {
        return entiteAdministrativeVo;
    }

    public void setEntiteAdministrativeVo(EntiteAdministrativeVo entiteAdministrativeVo) {
        this.entiteAdministrativeVo = entiteAdministrativeVo;
    }
    
    
}
