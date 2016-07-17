package com.yiibai.springmvc.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by lenovo on 2016/7/14.
 */
@Entity
@Table(name = "user_group", schema = "xurong")
public class UserGroupEntity {

    private long groupId;
    private String groupType;
    private String groupName;
    private String groupLeader;
    private String groupDesc;
    private Long parentId;
    private Integer groupNumber;
    private Collection<UsersEntity> usersesByGroupId;

    @Id
    @Column(name = "GROUP_ID")
    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "GROUP_TYPE")
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    @Basic
    @Column(name = "GROUP_NAME")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "GROUP_LEADER")
    public String getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(String groupLeader) {
        this.groupLeader = groupLeader;
    }

    @Basic
    @Column(name = "GROUP_DESC")
    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    @Basic
    @Column(name = "PARENT_ID")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "GROUP_NUMBER")
    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserGroupEntity that = (UserGroupEntity) o;

        if (groupId != that.groupId) return false;
        if (groupType != null ? !groupType.equals(that.groupType) : that.groupType != null) return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;
        if (groupLeader != null ? !groupLeader.equals(that.groupLeader) : that.groupLeader != null) return false;
        if (groupDesc != null ? !groupDesc.equals(that.groupDesc) : that.groupDesc != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (groupNumber != null ? !groupNumber.equals(that.groupNumber) : that.groupNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (groupId ^ (groupId >>> 32));
        result = 31 * result + (groupType != null ? groupType.hashCode() : 0);
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (groupLeader != null ? groupLeader.hashCode() : 0);
        result = 31 * result + (groupDesc != null ? groupDesc.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (groupNumber != null ? groupNumber.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userGroupByUserGroupId")
    public Collection<UsersEntity> getUsersesByGroupId() {
        return usersesByGroupId;
    }

    public void setUsersesByGroupId(Collection<UsersEntity> usersesByGroupId) {
        this.usersesByGroupId = usersesByGroupId;
    }
}
