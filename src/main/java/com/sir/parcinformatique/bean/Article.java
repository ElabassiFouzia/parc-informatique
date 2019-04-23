/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author SAMSUNG
 */
@Entity
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String operation;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateInvention;
    private String codeBarre;
    private String observation;
    private String numeroSerie;
    private String numeroMarche;
    @ManyToOne
    private Model model;
    @ManyToOne
    private SousFamille sousFamille;
    @ManyToOne
    private Locale locale;
    @ManyToOne
    private Responsable responsable;

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

    public Date getDateInvention() {
        return dateInvention;
    }

    public void setDateInvention(Date dateInvention) {
        this.dateInvention = dateInvention;
    }

 

    public String getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(String codeBarre) {
        this.codeBarre = codeBarre;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
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

   

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public SousFamille getSousFamille() {
        return sousFamille;
    }

    public void setSousFamille(SousFamille sousFamille) {
        this.sousFamille = sousFamille;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
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
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", operation=" + operation + ", dateInvention=" + dateInvention + ", codeBarre=" + codeBarre + ", observation=" + observation + ", numeroSerie=" + numeroSerie + ", numeroMarche=" + numeroMarche + ", model=" + model + ", sousFamille=" + sousFamille + ", locale=" + locale + ", responsable=" + responsable + '}';
    }

 



}
