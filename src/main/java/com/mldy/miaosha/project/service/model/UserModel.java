package com.mldy.miaosha.project.service.model;

import com.mldy.miaosha.project.dataobject.UserDO;

/**
 * @author apple
 * @className UserModel
 * @description
 * @date 2019/5/9
 */
public class UserModel extends UserDO {
    private String encrptPassword;

    public String getEncrptPassword() {
        return encrptPassword;
    }

    public void setEncrptPassword(String encrptPassword) {
        this.encrptPassword = encrptPassword;
    }
}
