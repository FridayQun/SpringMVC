package com.yiibai.springmvc.controller;

import com.yiibai.springmvc.model.RoleEntity;
import com.yiibai.springmvc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
@Controller
public class AppController {

    @Autowired
    RoleService roleService;

    @RequestMapping(value = {"/", "list"}, method = RequestMethod.GET)
    public String listUsers(ModelMap modelMap){
        modelMap.addAttribute("role", new RoleEntity());
        return "roleadd";
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.POST)
    public String saveRole(@Validated RoleEntity roleEntity, BindingResult result,
                           ModelMap modelMap){
        System.out.println(roleEntity.getRoleDesc());
        System.out.println(roleEntity.getUserRole());
        roleService.saveRole(roleEntity);

        return "registrationsuccess";
    }

}
