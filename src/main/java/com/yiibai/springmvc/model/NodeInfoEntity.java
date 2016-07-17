package com.yiibai.springmvc.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by lenovo on 2016/7/15.
 */
@Entity
@Table(name = "node_info", schema = "xurong", catalog = "")
public class NodeInfoEntity {

    private String nodeId;
    private String nodeGroupId;
    private String nodeName;
    private String versionName;
    private String isAssign;
    private String nodeStatus;
    private String macAddr;
    private String simNo;
    private String machineType;
    private String monopoly;
    private String nodeAddr;
    private String nodeFrom;
    private Collection<ChannelInfoEntity> channelInfosByNodeId;

    @Id
    @Column(name = "NODE_ID")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Basic
    @Column(name = "NODE_GROUP_ID")
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    @Basic
    @Column(name = "NODE_NAME")
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    @Basic
    @Column(name = "VERSION_NAME")
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    @Basic
    @Column(name = "IS_ASSIGN")
    public String getIsAssign() {
        return isAssign;
    }

    public void setIsAssign(String isAssign) {
        this.isAssign = isAssign;
    }

    @Basic
    @Column(name = "NODE_STATUS")
    public String getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    @Basic
    @Column(name = "MAC_ADDR")
    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    @Basic
    @Column(name = "SIM_NO")
    public String getSimNo() {
        return simNo;
    }

    public void setSimNo(String simNo) {
        this.simNo = simNo;
    }

    @Basic
    @Column(name = "MACHINE_TYPE")
    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    @Basic
    @Column(name = "MONOPOLY")
    public String getMonopoly() {
        return monopoly;
    }

    public void setMonopoly(String monopoly) {
        this.monopoly = monopoly;
    }

    @Basic
    @Column(name = "NODE_ADDR")
    public String getNodeAddr() {
        return nodeAddr;
    }

    public void setNodeAddr(String nodeAddr) {
        this.nodeAddr = nodeAddr;
    }

    @Basic
    @Column(name = "NODE_FROM")
    public String getNodeFrom() {
        return nodeFrom;
    }

    public void setNodeFrom(String nodeFrom) {
        this.nodeFrom = nodeFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeInfoEntity that = (NodeInfoEntity) o;

        if (nodeId != null ? !nodeId.equals(that.nodeId) : that.nodeId != null) return false;
        if (nodeGroupId != null ? !nodeGroupId.equals(that.nodeGroupId) : that.nodeGroupId != null) return false;
        if (nodeName != null ? !nodeName.equals(that.nodeName) : that.nodeName != null) return false;
        if (versionName != null ? !versionName.equals(that.versionName) : that.versionName != null) return false;
        if (isAssign != null ? !isAssign.equals(that.isAssign) : that.isAssign != null) return false;
        if (nodeStatus != null ? !nodeStatus.equals(that.nodeStatus) : that.nodeStatus != null) return false;
        if (macAddr != null ? !macAddr.equals(that.macAddr) : that.macAddr != null) return false;
        if (simNo != null ? !simNo.equals(that.simNo) : that.simNo != null) return false;
        if (machineType != null ? !machineType.equals(that.machineType) : that.machineType != null) return false;
        if (monopoly != null ? !monopoly.equals(that.monopoly) : that.monopoly != null) return false;
        if (nodeAddr != null ? !nodeAddr.equals(that.nodeAddr) : that.nodeAddr != null) return false;
        if (nodeFrom != null ? !nodeFrom.equals(that.nodeFrom) : that.nodeFrom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nodeId != null ? nodeId.hashCode() : 0;
        result = 31 * result + (nodeGroupId != null ? nodeGroupId.hashCode() : 0);
        result = 31 * result + (nodeName != null ? nodeName.hashCode() : 0);
        result = 31 * result + (versionName != null ? versionName.hashCode() : 0);
        result = 31 * result + (isAssign != null ? isAssign.hashCode() : 0);
        result = 31 * result + (nodeStatus != null ? nodeStatus.hashCode() : 0);
        result = 31 * result + (macAddr != null ? macAddr.hashCode() : 0);
        result = 31 * result + (simNo != null ? simNo.hashCode() : 0);
        result = 31 * result + (machineType != null ? machineType.hashCode() : 0);
        result = 31 * result + (monopoly != null ? monopoly.hashCode() : 0);
        result = 31 * result + (nodeAddr != null ? nodeAddr.hashCode() : 0);
        result = 31 * result + (nodeFrom != null ? nodeFrom.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "nodeInfoByNodeId")
    public Collection<ChannelInfoEntity> getChannelInfosByNodeId() {
        return channelInfosByNodeId;
    }

    public void setChannelInfosByNodeId(Collection<ChannelInfoEntity> channelInfosByNodeId) {
        this.channelInfosByNodeId = channelInfosByNodeId;
    }
}
