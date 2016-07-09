package com.yiibai.springmvc.model;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/7/6.
 */
@Entity
@Table(name = "role", schema = "xurong")
public class RoleEntity {

    private long roleId;
    private String roleName;
    private String roleDesc;
    private Long roleFlag;
    private String userRole;
    private String roleRole;
    private String nodeRole;
    private String wareRole;
    private String mapRole;
    private String channelRole;
    private String importRole;
    private String optempRole;
    private String depotRole;
    private String moneyRole;
    private String profitRole;

    @Id
    @Column(name = "ROLE_ID")
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "ROLE_NAME")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "ROLE_DESC")
    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Basic
    @Column(name = "ROLE_FLAG")
    public Long getRoleFlag() {
        return roleFlag;
    }

    public void setRoleFlag(Long roleFlag) {
        this.roleFlag = roleFlag;
    }

    @Basic
    @Column(name = "USER_ROLE")
    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Basic
    @Column(name = "ROLE_ROLE")
    public String getRoleRole() {
        return roleRole;
    }

    public void setRoleRole(String roleRole) {
        this.roleRole = roleRole;
    }

    @Basic
    @Column(name = "NODE_ROLE")
    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    @Basic
    @Column(name = "WARE_ROLE")
    public String getWareRole() {
        return wareRole;
    }

    public void setWareRole(String wareRole) {
        this.wareRole = wareRole;
    }

    @Basic
    @Column(name = "MAP_ROLE")
    public String getMapRole() {
        return mapRole;
    }

    public void setMapRole(String mapRole) {
        this.mapRole = mapRole;
    }

    @Basic
    @Column(name = "CHANNEL_ROLE")
    public String getChannelRole() {
        return channelRole;
    }

    public void setChannelRole(String channelRole) {
        this.channelRole = channelRole;
    }

    @Basic
    @Column(name = "IMPORT_ROLE")
    public String getImportRole() {
        return importRole;
    }

    public void setImportRole(String importRole) {
        this.importRole = importRole;
    }

    @Basic
    @Column(name = "OPTEMP_ROLE")
    public String getOptempRole() {
        return optempRole;
    }

    public void setOptempRole(String optempRole) {
        this.optempRole = optempRole;
    }

    @Basic
    @Column(name = "DEPOT_ROLE")
    public String getDepotRole() {
        return depotRole;
    }

    public void setDepotRole(String depotRole) {
        this.depotRole = depotRole;
    }

    @Basic
    @Column(name = "MONEY_ROLE")
    public String getMoneyRole() {
        return moneyRole;
    }

    public void setMoneyRole(String moneyRole) {
        this.moneyRole = moneyRole;
    }

    @Basic
    @Column(name = "PROFIT_ROLE")
    public String getProfitRole() {
        return profitRole;
    }

    public void setProfitRole(String profitRole) {
        this.profitRole = profitRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (roleId != that.roleId) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;
        if (roleDesc != null ? !roleDesc.equals(that.roleDesc) : that.roleDesc != null) return false;
        if (roleFlag != null ? !roleFlag.equals(that.roleFlag) : that.roleFlag != null) return false;
        if (userRole != null ? !userRole.equals(that.userRole) : that.userRole != null) return false;
        if (roleRole != null ? !roleRole.equals(that.roleRole) : that.roleRole != null) return false;
        if (nodeRole != null ? !nodeRole.equals(that.nodeRole) : that.nodeRole != null) return false;
        if (wareRole != null ? !wareRole.equals(that.wareRole) : that.wareRole != null) return false;
        if (mapRole != null ? !mapRole.equals(that.mapRole) : that.mapRole != null) return false;
        if (channelRole != null ? !channelRole.equals(that.channelRole) : that.channelRole != null) return false;
        if (importRole != null ? !importRole.equals(that.importRole) : that.importRole != null) return false;
        if (optempRole != null ? !optempRole.equals(that.optempRole) : that.optempRole != null) return false;
        if (depotRole != null ? !depotRole.equals(that.depotRole) : that.depotRole != null) return false;
        if (moneyRole != null ? !moneyRole.equals(that.moneyRole) : that.moneyRole != null) return false;
        if (profitRole != null ? !profitRole.equals(that.profitRole) : that.profitRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (roleDesc != null ? roleDesc.hashCode() : 0);
        result = 31 * result + (roleFlag != null ? roleFlag.hashCode() : 0);
        result = 31 * result + (userRole != null ? userRole.hashCode() : 0);
        result = 31 * result + (roleRole != null ? roleRole.hashCode() : 0);
        result = 31 * result + (nodeRole != null ? nodeRole.hashCode() : 0);
        result = 31 * result + (wareRole != null ? wareRole.hashCode() : 0);
        result = 31 * result + (mapRole != null ? mapRole.hashCode() : 0);
        result = 31 * result + (channelRole != null ? channelRole.hashCode() : 0);
        result = 31 * result + (importRole != null ? importRole.hashCode() : 0);
        result = 31 * result + (optempRole != null ? optempRole.hashCode() : 0);
        result = 31 * result + (depotRole != null ? depotRole.hashCode() : 0);
        result = 31 * result + (moneyRole != null ? moneyRole.hashCode() : 0);
        result = 31 * result + (profitRole != null ? profitRole.hashCode() : 0);
        return result;
    }
}
