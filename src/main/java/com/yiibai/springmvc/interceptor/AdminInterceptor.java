package com.yiibai.springmvc.interceptor;

import com.yiibai.springmvc.model.RoleEntity;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lenovo on 2016/7/14.
 */
public class AdminInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String servletPath = httpServletRequest.getServletPath().toString();
        RoleEntity roleEntity = (RoleEntity) httpServletRequest.getSession().getAttribute("role");

        if(servletPath.equals("/usersadd")) {
            if(roleEntity.getUserRole().charAt(0) == '0') {
                httpServletResponse.sendRedirect("/error");
                return false;
            }
        }
        if(servletPath.equals("/groupadd")) {
            if(roleEntity.getUserRole().charAt(0) == '0') {
                httpServletResponse.sendRedirect("/error");
                return false;
            }
        }
        if(servletPath.equals("/roleadd")) {
            if(roleEntity.getUserRole().charAt(0) == '0') {
                httpServletResponse.sendRedirect("/error");
                return false;
            }
        }
        if(servletPath.equals("/wareadd")) {
            if(roleEntity.getUserRole().charAt(0) == '0') {
                httpServletResponse.sendRedirect("/error");
                return false;
            }
        }
        if(servletPath.equals("/nodeadd")) {
            if(roleEntity.getUserRole().charAt(0) == '0') {
                httpServletResponse.sendRedirect("/error");
                return false;
            }
        }
        if(servletPath.equals("/warelist")) {
            if(roleEntity.getUserRole().charAt(3) == '0') {
                httpServletResponse.sendRedirect("/error");
                return false;
            }
        }
        if(servletPath.equals("/nodelist")) {
            if(roleEntity.getUserRole().charAt(3) == '0') {
                httpServletResponse.sendRedirect("/error");
                return false;
            }
        }
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
