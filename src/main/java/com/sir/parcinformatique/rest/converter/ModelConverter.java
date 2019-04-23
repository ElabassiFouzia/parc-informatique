/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.converter;

import com.sir.parcinformatique.bean.Model;
import com.sir.parcinformatique.rest.vo.ModelVo;

/**
 *
 * @author samsung
 */
public class ModelConverter extends AbstractConverter<Model, ModelVo> {

    @Override
    public Model toItem(ModelVo vo) {
        if(vo!=null){
            Model model = new Model();
            model.setId(vo.getId());
            model.setLibelle(vo.getLibelle());
            //model.setArticles(new ArticleConverter().toItem(vo.getArticleVos()));
            model.setMarque(new MarqueConverter().toItem(vo.getMarqueVo()));
            return model;
        }
        return null;
    }

    @Override
    public ModelVo toVo(Model item) {
        if(item!=null){
            ModelVo modelVo = new ModelVo();
            modelVo.setId(item.getId());
            modelVo.setLibelle(item.getLibelle());
//            modelVo.setArticleVos(new ArticleConverter().toVo(item.getArticles()));
            modelVo.setMarqueVo(new MarqueConverter().toVo(item.getMarque()));
            return modelVo;
        }
        return null;
    }
    
}
