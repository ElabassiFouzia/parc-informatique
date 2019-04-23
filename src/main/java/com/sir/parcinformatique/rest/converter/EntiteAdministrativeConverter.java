/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.converter;

import com.sir.parcinformatique.bean.EntiteAdministrative;
import com.sir.parcinformatique.rest.vo.EntiteAdministrativeVo;

/**
 *
 * @author SAMSUNG
 */
public class EntiteAdministrativeConverter extends AbstractConverter<EntiteAdministrative, EntiteAdministrativeVo>{

    @Override
    public EntiteAdministrative toItem(EntiteAdministrativeVo vo) {
        if(vo==null){
            return null;
        }
        else{
            EntiteAdministrative entiteAdministrative = new EntiteAdministrative();
            entiteAdministrative.setLibelle(vo.getLibelle());
            entiteAdministrative.setRattachement(new RattachementConverter().toItem(vo.getRattachementVo()));
               return entiteAdministrative;
        }
    }

    @Override
    public EntiteAdministrativeVo toVo(EntiteAdministrative item) {
  if(item ==null){
            return null;
        }
        else{
            EntiteAdministrativeVo entiteAdministrativeVo = new EntiteAdministrativeVo();
            entiteAdministrativeVo.setLibelle(item.getLibelle());
            entiteAdministrativeVo.setRattachementVo(new RattachementConverter().toVo(item.getRattachement()));
               return entiteAdministrativeVo;
        }    }
   

    
}
