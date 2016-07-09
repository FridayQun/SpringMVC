package com.yiibai.springmvc.controller;

import com.yiibai.springmvc.model.RoleEntity;
import com.yiibai.springmvc.model.UsersEntity;
import com.yiibai.springmvc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lenovo on 2016/7/9.
 */

@Controller
public class LoginController {

    @Autowired
    RoleService roleService;

    @RequestMapping(value = {"loginpage"}, method = RequestMethod.GET)
    public String showLogin(ModelMap modelMap){
        modelMap.addAttribute("roles", roleService.findAllRoles());
        modelMap.addAttribute("user", new UsersEntity());
        return "login";
    }

    @RequestMapping(value = {"logincontroller"}, method = RequestMethod.POST)
    public String valid(@Validated UsersEntity usersEntity, BindingResult result,
                        ModelMap modelMap){
        String username = usersEntity.getUserName();
        String password = usersEntity.getPassWord();




    }
}
