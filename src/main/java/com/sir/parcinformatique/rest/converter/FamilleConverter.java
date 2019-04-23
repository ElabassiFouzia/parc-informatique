/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.converter;

import com.sir.parcinformatique.bean.Famille;
import com.sir.parcinformatique.rest.vo.FamilleVo;

/**
 *
 * @author Ibtissam
 */
public class FamilleConverter extends AbstractConverter<Famille, FamilleVo> {

    @Override
    public Famille toItem(FamilleVo vo) {
        if(vo!=null){
            Famille famille = new Famille();
            famille.setId(vo.getId());
            famille.setLibelle(vo.getLibelle());
           // famille.setSousFamilles(new SousFamilleConverter().toItem(vo.getSousFamilleVos()));
            return famille;
        }
        return null;
    }

    @Override
    public FamilleVo toVo(Famille item) {
        if(item!=null){
            FamilleVo familleVo = new FamilleVo();
            familleVo.setId(item.getId());
            familleVo.setLibelle(item.getLibelle());
//            familleVo.setSousFamilleVos(new SousFamilleConverter().toVo(item.getSousFamilles()));
            return familleVo;
        }
        return null;
    }
    
}
