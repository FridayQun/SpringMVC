package com.yiibai.springmvc.controller;

import com.yiibai.springmvc.model.RoleEntity;
import com.yiibai.springmvc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

    @Autowired
    RoleService roleService;

    @RequestMapping("/error")
    public String error(Model model){
        return "error";
    }

    @RequestMapping(value = {"/", "list"}, method = RequestMethod.GET)
    public String listUsers(ModelMap modelMap){
        modelMap.addAttribute("role", new RoleEntity());
        return "roleadd";
    }

    @RequestMapping(value = {"jjjj"}, method = RequestMethod.POST)
    public String saveRole(@Validated RoleEntity roleEntity, BindingResult result,
                           ModelMap modelMap){
        System.out.println(roleEntity.getRoleDesc());
        System.out.println(roleEntity.getUserRole());
        roleService.saveRole(roleEntity);

        return "registrationsuccess";
    }

}
