package com.mldy.miaosha.project.service.impl;

import com.mldy.miaosha.project.dao.UserDOMapper;
import com.mldy.miaosha.project.dao.UserPasswordDOMapper;
import com.mldy.miaosha.project.dataobject.UserDO;
import com.mldy.miaosha.project.dataobject.UserPasswordDO;
import com.mldy.miaosha.project.service.UserService;
import com.mldy.miaosha.project.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * @author apple
 * @className UserServiceImpl
 * @description
 * @date 2019/5/9
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public UserModel getUserByUserId(Integer id) {
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if(userDO == null){
            return null;
        }
        Condition condition = new Condition(UserPasswordDO.class);
        condition.createCriteria().andEqualTo("userId",id);
        List<UserPasswordDO> userPasswordDOS = userPasswordDOMapper.selectByCondition(condition);
        if(userPasswordDOS != null && userPasswordDOS.size() > 0){
            return convertFromDataObject(userDO,userPasswordDOS.get(0));
        }
        return null;
    }

    private UserModel convertFromDataObject(UserDO userDO,UserPasswordDO userPasswordDO){
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDO,userModel);
        userModel.setEncrptPassword(userPasswordDO.getEncrptPassword());
        return userModel;
    }
}
