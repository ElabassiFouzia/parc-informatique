/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.converter;

import com.sir.parcinformatique.bean.Rattachement;
import com.sir.parcinformatique.rest.vo.RattachementVo;

/**
 *
 * @author SAMSUNG
 */
public class RattachementConverter extends AbstractConverter<Rattachement, RattachementVo> {

    @Override
    public Rattachement toItem(RattachementVo vo) {
        if (vo == null) {
            return null;
        } else {
            Rattachement rattachement = new Rattachement();
            rattachement.setLibelle(vo.getLibelle());
            //  rattachement.setEntiteAdministratives(new EntiteAdministrativeConverter().toItem(vo.getEntiteAdministrativeVos()));

            return rattachement;
        }

    }

    @Override
    public RattachementVo toVo(Rattachement item) {
        if (item == null) {
            return null;
        } else {
            RattachementVo rattachementVo = new RattachementVo();
            rattachementVo.setLibelle(item.getLibelle());
            //  rattachementVo.setEntiteAdministrativeVos(new EntiteAdministrativeConverter().toVo(item.getEntiteAdministratives()));
            return rattachementVo;
        }

    }

}
