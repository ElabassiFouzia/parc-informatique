/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.converter;

import com.sir.parcinformatique.bean.SousFamille;
import com.sir.parcinformatique.rest.vo.SousFamilleVo;



/**
 *
 * @author Ibtissam
 */
public class SousFamilleConverter extends AbstractConverter<SousFamille, SousFamilleVo> {

    @Override
    public SousFamille toItem(SousFamilleVo vo) {
        if (vo!=null){
            SousFamille sousFamille = new SousFamille();
            sousFamille.setId(vo.getId());
            sousFamille.setLibelle(vo.getLibelle());
            sousFamille.setFamille(new FamilleConverter().toItem(vo.getFamilleVo()));
            
            return sousFamille;
        }
        return null;
    }

    @Override
    public SousFamilleVo toVo(SousFamille item) {
        if(item!=null){
            SousFamilleVo sousFamilleVo = new SousFamilleVo();
            sousFamilleVo.setId(item.getId());
            sousFamilleVo.setLibelle(item.getLibelle());
            sousFamilleVo.setFamilleVo(new FamilleConverter().toVo(item.getFamille()));
            
            return sousFamilleVo;
        }
        return null;
    }
    
}
