/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.parcinformatique.rest.converter;

import com.sir.parcinformatique.bean.User;
import com.sir.parcinformatique.commun.util.DateUtil;
import static com.sir.parcinformatique.commun.util.DateUtil.paternYYYY_MM_DD;
import com.sir.parcinformatique.commun.util.NumberUtil;
import com.sir.parcinformatique.rest.vo.UserVo;

/**
 *
 * @author SAMSUNG
 */
public class UserConverter extends AbstractConverter<User, UserVo> {

    @Override
    public User toItem(UserVo vo) {
        if (vo == null) {
            return null;
        } else {
            User user = new User();
            user.setMatricule(NumberUtil.toLong(vo.getMatricule()));
            user.setNomPrenom(vo.getNomPrenom());
            user.setPassword(vo.getPassword());
            user.setPoste(vo.getPoste());
            user.setDateModification(DateUtil.parse(vo.getDateModification(), paternYYYY_MM_DD));
            user.setRole(new RoleConverter().toItem(vo.getRoleVo()));
            user.setEntiteAdministrative(new EntiteAdministrativeConverter().toItem(vo.getEntiteAdministrativeVo()));
        return user;
        }
    }

    @Override
    public UserVo toVo(User item) {
if (item == null) {
            return null;
        } else {
            UserVo userVo = new UserVo();
            userVo.setMatricule(NumberUtil.toString(item.getMatricule()));
            userVo.setNomPrenom(item.getNomPrenom());
            userVo.setPassword(item.getPassword());
            userVo.setPoste(item.getPoste());
            userVo.setDateModification(DateUtil.format(item.getDateModification(), paternYYYY_MM_DD));
            userVo.setRoleVo(new RoleConverter().toVo(item.getRole()));
            userVo.setEntiteAdministrativeVo(new EntiteAdministrativeConverter().toVo(item.getEntiteAdministrative()));
        return userVo;
        }    
    }

}
