package com.yiibai.springmvc.model;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/7/14.
 */
@Entity
@Table(name = "users", schema = "xurong")
public class UsersEntity {

    private long userId;
    private String userName;
    private String passWord;
    private String employeeName;
    private String personList;
    private Long leaderId;
    private String userStatus;
    private RoleEntity roleByUserRoleId;
    private UserGroupEntity userGroupByUserGroupId;

    @Id
    @Column(name = "USER_ID")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASS_WORD")
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Basic
    @Column(name = "EMPLOYEE_NAME")
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Basic
    @Column(name = "PERSON_LIST")
    public String getPersonList() {
        return personList;
    }

    public void setPersonList(String personList) {
        this.personList = personList;
    }

    @Basic
    @Column(name = "LEADER_ID")
    public Long getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    @Basic
    @Column(name = "USER_STATUS")
    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (userId != that.userId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (passWord != null ? !passWord.equals(that.passWord) : that.passWord != null) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;
        if (personList != null ? !personList.equals(that.personList) : that.personList != null) return false;
        if (leaderId != null ? !leaderId.equals(that.leaderId) : that.leaderId != null) return false;
        if (userStatus != null ? !userStatus.equals(that.userStatus) : that.userStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (passWord != null ? passWord.hashCode() : 0);
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (personList != null ? personList.hashCode() : 0);
        result = 31 * result + (leaderId != null ? leaderId.hashCode() : 0);
        result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ROLE_ID", referencedColumnName = "ROLE_ID")
    public RoleEntity getRoleByUserRoleId() {
        return roleByUserRoleId;
    }

    public void setRoleByUserRoleId(RoleEntity roleByUserRoleId) {
        this.roleByUserRoleId = roleByUserRoleId;
    }

    @ManyToOne
    @JoinColumn(name = "USER_GROUP_ID", referencedColumnName = "GROUP_ID")
    public UserGroupEntity getUserGroupByUserGroupId() {
        return userGroupByUserGroupId;
    }

    public void setUserGroupByUserGroupId(UserGroupEntity userGroupByUserGroupId) {
        this.userGroupByUserGroupId = userGroupByUserGroupId;
    }
}
