/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.converter;

import com.sir.parcinformatique.bean.Article;
import com.sir.parcinformatique.commun.util.DateUtil;
import static com.sir.parcinformatique.commun.util.DateUtil.paternYYYY_MM_DD;
import com.sir.parcinformatique.rest.vo.ArticleVo;

/**
 *
 * @author Ibtissam
 */
public class ArticleConverter extends AbstractConverter<Article, ArticleVo> {

    @Override
    public Article toItem(ArticleVo vo) {
        if(vo!=null){
            Article article = new Article();
            article.setId(vo.getId());
            article.setCodeBarre(vo.getCodeBarre());
            article.setNumeroMarche(vo.getNumeroMarche());
            article.setNumeroSerie(vo.getNumeroSerie());
            article.setObservation(vo.getObservation());
            article.setOperation(vo.getOperation());
            article.setSousFamille(new SousFamilleConverter().toItem(vo.getSousFamilleVo()));
            article.setDateInvention(DateUtil.parse(vo.getDateInvention(),paternYYYY_MM_DD));
            article.setModel(new ModelConverter().toItem(vo.getModelVo()));
            article.setResponsable(new ResponsableConverter().toItem(vo.getResponsableVo()));
            article.setLocale(new LocaleConverter().toItem(vo.getLocaleVo()));
            return article;
        }
        return null;
    }

    @Override
    public ArticleVo toVo(Article item) {
        if(item!=null){
            ArticleVo articleVo = new ArticleVo();
            articleVo.setId(item.getId());
            articleVo.setCodeBarre(item.getCodeBarre());
            articleVo.setNumeroMarche(item.getNumeroMarche());
            articleVo.setNumeroSerie(item.getNumeroSerie());
            articleVo.setObservation(item.getObservation());
            articleVo.setOperation(item.getOperation());
            articleVo.setSousFamilleVo(new SousFamilleConverter().toVo(item.getSousFamille()));
            articleVo.setDateInvention(DateUtil.format(item.getDateInvention(), paternYYYY_MM_DD));
            articleVo.setModelVo(new ModelConverter().toVo(item.getModel()));
            articleVo.setResponsableVo(new ResponsableConverter().toVo(item.getResponsable()));
            articleVo.setLocaleVo(new LocaleConverter().toVo(item.getLocale()));
            return articleVo;
        }
        return null;
    }
    
}
