package com.yiibai.springmvc.controller;

import com.yiibai.springmvc.model.RoleEntity;
import com.yiibai.springmvc.model.UserGroupEntity;
import com.yiibai.springmvc.model.UsersEntity;
import com.yiibai.springmvc.service.GroupService;
import com.yiibai.springmvc.service.RoleService;
import com.yiibai.springmvc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created by lenovo on 2016/7/9.
 */

@Controller
public class LoginController {

    @Autowired
    RoleService roleService;
    @Autowired
    UsersService usersService;

    @RequestMapping("/views/hello")
    public String sayHello(Model model) {
        model.addAttribute("nihao", "nae");
        return "hello";
    }

//    @RequestMapping(value = {"loginpage"}, method = RequestMethod.GET)
//    public String showLogin(ModelMap modelMap){
//        modelMap.addAttribute("roles", roleService.findAllRoles());
//        modelMap.addAttribute("user", new UsersEntity());
//        return "login";
//    }

    @RequestMapping("/loginAction")
    public String loginAction(HttpServletRequest request) {
        if(request.getParameter("userName") == null) {
            request.setAttribute("roles", roleService.findAllRoles());
            request.setAttribute("user", new UsersEntity());
            return "loginAction";
        }
        request.getSession().setAttribute("userName", null);
        String userName = request.getParameter("userName");
        String password = request.getParameter("passWord");
        UsersEntity usersEntity = usersService.findByUsersName(userName);
        if(usersEntity.getPassWord().equals(password) == false) {
            request.setAttribute("roles", roleService.findAllRoles());
            request.setAttribute("user", new UsersEntity());
            return "loginAction";
        }
        RoleEntity roleEntity = usersEntity.getRoleByUserRoleId();
        UserGroupEntity groupEntity = usersEntity.getUserGroupByUserGroupId();
        request.getSession().setAttribute("userName", userName);
        request.getSession().setAttribute("users", usersEntity);
        request.getSession().setAttribute("group", groupEntity);
        request.getSession().setAttribute("role", roleEntity);
        return "hello";
    }

//    @RequestMapping(value = {"logincontroller"}, method = RequestMethod.POST)
//    public String valid(@Validated UsersEntity usersEntity, BindingResult result,
//                        ModelMap modelMap){
//        String username = usersEntity.getUserName();
//        String password = usersEntity.getPassWord();
//
//        return "loginSuccess";
//    }
}
