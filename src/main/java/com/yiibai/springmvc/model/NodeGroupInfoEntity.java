package com.yiibai.springmvc.model;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/7/15.
 */
@Entity
@Table(name = "node_group_info", schema = "xurong", catalog = "")
public class NodeGroupInfoEntity {

    private String nodeGroupId;
    private String nodeGroupName;
    private String nodeGroupType;
    private String nodeGroupDesc;
    private String groupParentId;

    @Id
    @Column(name = "NODE_GROUP_ID")
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    @Basic
    @Column(name = "NODE_GROUP_NAME")
    public String getNodeGroupName() {
        return nodeGroupName;
    }

    public void setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
    }

    @Basic
    @Column(name = "NODE_GROUP_TYPE")
    public String getNodeGroupType() {
        return nodeGroupType;
    }

    public void setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
    }

    @Basic
    @Column(name = "NODE_GROUP_DESC")
    public String getNodeGroupDesc() {
        return nodeGroupDesc;
    }

    public void setNodeGroupDesc(String nodeGroupDesc) {
        this.nodeGroupDesc = nodeGroupDesc;
    }

    @Basic
    @Column(name = "GROUP_PARENT_ID")
    public String getGroupParentId() {
        return groupParentId;
    }

    public void setGroupParentId(String groupParentId) {
        this.groupParentId = groupParentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeGroupInfoEntity that = (NodeGroupInfoEntity) o;

        if (nodeGroupId != null ? !nodeGroupId.equals(that.nodeGroupId) : that.nodeGroupId != null) return false;
        if (nodeGroupName != null ? !nodeGroupName.equals(that.nodeGroupName) : that.nodeGroupName != null)
            return false;
        if (nodeGroupType != null ? !nodeGroupType.equals(that.nodeGroupType) : that.nodeGroupType != null)
            return false;
        if (nodeGroupDesc != null ? !nodeGroupDesc.equals(that.nodeGroupDesc) : that.nodeGroupDesc != null)
            return false;
        if (groupParentId != null ? !groupParentId.equals(that.groupParentId) : that.groupParentId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nodeGroupId != null ? nodeGroupId.hashCode() : 0;
        result = 31 * result + (nodeGroupName != null ? nodeGroupName.hashCode() : 0);
        result = 31 * result + (nodeGroupType != null ? nodeGroupType.hashCode() : 0);
        result = 31 * result + (nodeGroupDesc != null ? nodeGroupDesc.hashCode() : 0);
        result = 31 * result + (groupParentId != null ? groupParentId.hashCode() : 0);
        return result;
    }
}
