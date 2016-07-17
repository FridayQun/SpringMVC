package com.yiibai.springmvc.controller;

import com.yiibai.springmvc.model.*;
import com.yiibai.springmvc.service.*;
import com.yiibai.springmvc.util.priorityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/7/14.
 */
@Controller
public class AdminController {
    @Autowired
    UsersService usersService;
    @Autowired
    RoleService roleService;
    @Autowired
    GroupService groupService;

    @RequestMapping("/userslist")
    public String usersList(HttpServletRequest request) {
        request.setAttribute("users", usersService.findAllUsers());
        return "userslist";
    }
    @RequestMapping("/grouplist")
    public String groupList(HttpServletRequest request) {
        request.setAttribute("groups", groupService.findAllGroups());
        return "grouplist";
    }
    @RequestMapping("/rolelist")
    public String roleList(HttpServletRequest request) {
        request.setAttribute("roles", roleService.findAllRoles());
        return "rolelist";
    }

    @RequestMapping("/usersadd")
    public String usersAdd(HttpServletRequest request) {
        if(request.getSession().getAttribute("roles") == null) {
            List<RoleEntity> roles = roleService.findAllRoles();
            List<UserGroupEntity> groups = groupService.findAllGroups();
            request.getSession().setAttribute("roles", roles);
            request.getSession().setAttribute("groups", groups);
        }
        request.setAttribute("roles", request.getSession().getAttribute("roles"));
        request.setAttribute("groups", request.getSession().getAttribute("groups"));
        if(request.getMethod().equals("GET")) {
            return "usersadd";
        }
        String name = request.getParameter("name");
        String employee_name = request.getParameter("employee_name");
        String passWord = request.getParameter("passWord");
        String role = request.getParameter("role");
        String group = request.getParameter("group");
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUserName(name);
        usersEntity.setEmployeeName(employee_name);
        usersEntity.setPassWord(passWord);
        usersEntity.setRoleByUserRoleId(roleService.findById(Long.parseLong(role)));
        usersEntity.setUserGroupByUserGroupId(groupService.findById(Long.parseLong(group)));
        usersService.saveUsers(usersEntity);
        request.setAttribute("success", "success");
        return "usersadd";
    }
    @RequestMapping("/roleadd")
    public String roleAdd(HttpServletRequest request) {
        request.setAttribute("role", request.getSession().getAttribute("role"));
        if(request.getMethod().equals("GET")) {
            return "roleadd";
        }
        String roleName = request.getParameter("roleName");
        String roleDesc = request.getParameter("roleDesc");
        String userRole = priorityUtil.getPriority(request.getParameterValues("userRole"));
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleName(roleName);
        roleEntity.setRoleDesc(roleDesc);
        roleEntity.setUserRole(userRole);
        roleService.saveRole(roleEntity);
        request.setAttribute("success", "success");
        return "roleadd";
    }
    @RequestMapping("/groupadd")
    public String groupAdd(HttpServletRequest request) {
        if(request.getMethod().equals("GET")) {
            return "groupadd";
        }
        String type = request.getParameter("type");
        String name = request.getParameter("name");
        String leader = request.getParameter("leader");
        String desc = request.getParameter("desc");
        UserGroupEntity groupEntity = new UserGroupEntity();
        groupEntity.setGroupType(type);
        groupEntity.setGroupName(name);
        groupEntity.setGroupLeader(leader);
        groupEntity.setGroupDesc(desc);
        groupService.save(groupEntity);
        request.setAttribute("success", "success");
        return "groupadd";
    }

    @Autowired
    WaresService waresService;
    @RequestMapping("/wareadd")
    public String wareAdd(HttpServletRequest request) {
        if(request.getMethod().equals("GET")) {
            return "wareadd";
        }
        String wareName = request.getParameter("wareName");
        String wareCode = request.getParameter("wareCode");
        String wareBasePrice = request.getParameter("wareBasePrice");
        String wareType = request.getParameter("wareType");
        String wareNorm = request.getParameter("wareNorm");
        String wareUnit = request.getParameter("wareUnit");
        WaresEntity waresEntity = new WaresEntity();
        waresEntity.setWareName(wareName);
        waresEntity.setWareCode(wareCode);
        waresEntity.setWareBasePrice(Integer.parseInt(wareBasePrice));
        waresEntity.setWareType(wareType);
        waresEntity.setWareNorm(wareNorm);
        waresEntity.setWareUnit(wareUnit);
        waresService.save(waresEntity);
        request.setAttribute("success", "success");
        return "wareadd";
    }

    @Autowired
    NodeGroupInfoService nodeGroupInfoService;
    @Autowired
    ChannelGroupService channelGroupService;
    @Autowired
    NodeInfoService nodeInfoService;

    @RequestMapping("/nodeadd")
    public String nodeAdd(HttpServletRequest request) {
        request.setAttribute("versions", channelGroupService.findAllChannelGroups());
        request.setAttribute("nodeGroups", nodeGroupInfoService.findAllNodeGroupInfos());
        List<String> machineTypes = new ArrayList<String>();
        machineTypes.add("饮料机");
        machineTypes.add("服务器");
        request.setAttribute("machineTypes", machineTypes);
        if(request.getMethod().equals("GET")) {
            return "nodeadd";
        }
        String nodeId = request.getParameter("nodeId");
        String nodeName = request.getParameter("nodeName");
        String versionName = request.getParameter("versionName");
        String nodeGroupId = request.getParameter("nodeGroupId");
        String machineType = request.getParameter("machineType");
        String macAddr = request.getParameter("macAddr");
        String simNo = request.getParameter("simNo");
        String monopoly = request.getParameter("monopoly");
        String nodeAddr = request.getParameter("nodeAddr");
        NodeInfoEntity nodeInfoEntity = new NodeInfoEntity();
        nodeInfoEntity.setNodeId(nodeId);
        nodeInfoEntity.setNodeName(nodeName);
        nodeInfoEntity.setVersionName(versionName);
        nodeInfoEntity.setNodeGroupId(nodeGroupId);
        nodeInfoEntity.setMachineType(machineType);
        nodeInfoEntity.setMacAddr(macAddr);
        nodeInfoEntity.setSimNo(simNo);
        nodeInfoEntity.setMonopoly(monopoly);
        nodeInfoEntity.setNodeAddr(nodeAddr);
        nodeInfoService.save(nodeInfoEntity);
        request.setAttribute("success", "success");
        return "nodeadd";
    }

    @RequestMapping("/nodelist")
    public String nodeList(HttpServletRequest request) {
        request.setAttribute("nodes", nodeInfoService.findAllNodeInfos());
        return "nodelist";
    }
    @RequestMapping("/warelist")
    public String wareList(HttpServletRequest request) {
        request.setAttribute("wares", waresService.findAllWares());
        return "warelist";
    }
}
