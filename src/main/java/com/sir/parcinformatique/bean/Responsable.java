/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author SAMSUNG
 */
@Entity
public class Responsable implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomPrenom;
    private Long matricule;
    private String poste;
    @ManyToOne
    private EntiteAdministrative entiteAdministrative;
    @OneToMany(mappedBy = "responsable")
    private List<Article> articles;

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

    public Long getMatricule() {
        return matricule;
    }

    public void setMatricule(Long matricule) {
        this.matricule = matricule;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public EntiteAdministrative getEntiteAdministrative() {
        return entiteAdministrative;
    }

    public void setEntiteAdministrative(EntiteAdministrative entiteAdministrative) {
        this.entiteAdministrative = entiteAdministrative;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsable)) {
            return false;
        }
        Responsable other = (Responsable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Responsable{" + "id=" + id + ", nomPrenom=" + nomPrenom + ", matricule=" + matricule + ", poste=" + poste + ", entiteAdministrative=" + entiteAdministrative + ", articles=" + articles + '}';
    }

 

 
    
}
