/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.converter;

import com.sir.parcinformatique.bean.Responsable;
import com.sir.parcinformatique.commun.util.NumberUtil;
import com.sir.parcinformatique.rest.vo.ResponsableVo;

/**
 *
 * @author Ibtissam
 */
public class ResponsableConverter extends AbstractConverter<Responsable, ResponsableVo> {

    @Override
    public Responsable toItem(ResponsableVo vo) {
        if(vo!=null){
            Responsable responsable = new Responsable();
            responsable.setId(vo.getId());
            responsable.setNomPrenom(vo.getNomPrenom());
            responsable.setPoste(vo.getPoste());
            responsable.setMatricule(NumberUtil.toLong(vo.getMatricule()));
           // responsable.setArticles(new ArticleConverter().toItem(vo.getArticleVos()));
            responsable.setEntiteAdministrative(new EntiteAdministrativeConverter().toItem(vo.getEntiteAdministrativeVo()));
            return responsable;
        }
        return null;
    }

    @Override
    public ResponsableVo toVo(Responsable item) {
        if(item!=null){
            ResponsableVo responsableVo = new ResponsableVo();
            responsableVo.setId(item.getId());
            responsableVo.setMatricule(NumberUtil.toString(item.getMatricule()));
            responsableVo.setPoste(item.getPoste());
            responsableVo.setNomPrenom(item.getNomPrenom());
            //responsableVo.setArticleVos(new ArticleConverter().toVo(item.getArticles()));
            responsableVo.setEntiteAdministrativeVo(new EntiteAdministrativeConverter().toVo(item.getEntiteAdministrative()));
            return responsableVo;
        }
        return null;
    }
    
}
