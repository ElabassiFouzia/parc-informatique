/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.converter;

import com.sir.parcinformatique.bean.Marque;
import com.sir.parcinformatique.rest.vo.MarqueVo;

/**
 *
 * @author Samsung
 */
public class MarqueConverter extends AbstractConverter<Marque, MarqueVo>  {

    @Override
    public Marque toItem(MarqueVo vo) {
        if(vo!=null){
            Marque marque = new Marque();
            marque.setId(vo.getId());
            marque.setLibelle(vo.getLibelle());
//            marque.setModels(new ModelConverter().toItem(vo.getModelVos()));
            return marque ;
        }
        return null;
    }

    @Override
    public MarqueVo toVo(Marque item) {
        if(item!=null){
            MarqueVo marqueVo = new MarqueVo();
            marqueVo.setId(item.getId());
            marqueVo.setLibelle(item.getLibelle());
//            marqueVo.setModelVos(new ModelConverter().toVo(item.getModels()));
            return marqueVo;
        } 
        return null;
    }
    
}
