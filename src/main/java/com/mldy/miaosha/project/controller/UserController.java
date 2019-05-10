package com.mldy.miaosha.project.controller;

import com.mldy.miaosha.project.controller.viewobject.UserVO;
import com.mldy.miaosha.project.service.UserService;
import com.mldy.miaosha.project.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author apple
 * @className UserController
 * @description
 * @date 2019/5/9
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public UserVO getUser(@RequestParam(name = "id") Integer id){
        return convertFromModel(userService.getUserByUserId(id));
    }


    /**
     * 将核心领域模型用户对象转化为可供UI使用的viewobject
     * @param userModel
     * @return
     */
    private UserVO convertFromModel(UserModel userModel){
        if(userModel == null){
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userModel,userVO);
        return userVO;
    }

}
