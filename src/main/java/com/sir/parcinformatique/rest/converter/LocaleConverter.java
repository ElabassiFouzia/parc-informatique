/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.converter;

import com.sir.parcinformatique.bean.Locale;
import com.sir.parcinformatique.rest.vo.LocaleVo;

/**
 *
 * @author samsung
 */
public class LocaleConverter extends AbstractConverter<Locale, LocaleVo> {

    @Override
    public Locale toItem(LocaleVo vo) {
        if (vo != null) {
            Locale locale = new Locale();
            locale.setId(vo.getId());
            locale.setLibelle(vo.getLibelle());
            //locale.setArticles(new ArticleConverter().toItem(vo.getArticleVos()));
            locale.setEntiteAdministrative(new EntiteAdministrativeConverter().toItem(vo.getEntiteAdministrativeVo()));
            return locale;
        }
        return null;
    }

    @Override
    public LocaleVo toVo(Locale item) {
        if (item != null) {
            LocaleVo localeVo = new LocaleVo();
            localeVo.setId(item.getId());
            //localeVo.setArticleVos(new ArticleConverter().toVo(item.getArticles()));
            localeVo.setLibelle(item.getLibelle());
            localeVo.setEntiteAdministrativeVo(new EntiteAdministrativeConverter().toVo(item.getEntiteAdministrative()));
            return localeVo;
        }
        return null;
    }

}
