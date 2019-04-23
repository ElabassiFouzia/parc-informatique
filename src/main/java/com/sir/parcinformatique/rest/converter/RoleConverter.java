/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.converter;

import com.sir.parcinformatique.bean.Role;
import com.sir.parcinformatique.rest.vo.RoleVo;

/**
 *
 * @author SAMSUNG
 */
public class RoleConverter extends AbstractConverter<Role, RoleVo>{

    @Override
    public Role toItem(RoleVo vo) {
        if(vo == null){
            return null;
        }
        else{
            Role role = new Role();
            role.setLibelle(vo.getLibelle());
            return role;
         
        }
    }

    @Override
    public RoleVo toVo(Role item) {
        if(item == null){
            return null;
        }
        else{
            RoleVo roleVo= new RoleVo();
            roleVo.setLibelle(item.getLibelle());
            return roleVo;
        }
    }
    
    
}
