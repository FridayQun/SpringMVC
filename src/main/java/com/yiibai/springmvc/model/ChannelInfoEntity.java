package com.yiibai.springmvc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lenovo on 2016/7/15.
 */
@Entity
@Table(name = "channel_info", schema = "xurong", catalog = "")
public class ChannelInfoEntity {

    private long id;
    private String channelId;
    private String wareId;
    private String wareName;
    private Integer normalStock;
    private Integer currentNumber;
    private Integer incrementNumber;
    private Integer isSpecial;
    private Timestamp lastTime;
    private NodeInfoEntity nodeInfoByNodeId;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CHANNEL_ID")
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @Basic
    @Column(name = "WARE_ID")
    public String getWareId() {
        return wareId;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    @Basic
    @Column(name = "WARE_NAME")
    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    @Basic
    @Column(name = "NORMAL_STOCK")
    public Integer getNormalStock() {
        return normalStock;
    }

    public void setNormalStock(Integer normalStock) {
        this.normalStock = normalStock;
    }

    @Basic
    @Column(name = "CURRENT_NUMBER")
    public Integer getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(Integer currentNumber) {
        this.currentNumber = currentNumber;
    }

    @Basic
    @Column(name = "INCREMENT_NUMBER")
    public Integer getIncrementNumber() {
        return incrementNumber;
    }

    public void setIncrementNumber(Integer incrementNumber) {
        this.incrementNumber = incrementNumber;
    }

    @Basic
    @Column(name = "IS_SPECIAL")
    public Integer getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(Integer isSpecial) {
        this.isSpecial = isSpecial;
    }

    @Basic
    @Column(name = "LAST_TIME")
    public Timestamp getLastTime() {
        return lastTime;
    }

    public void setLastTime(Timestamp lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChannelInfoEntity that = (ChannelInfoEntity) o;

        if (id != that.id) return false;
        if (channelId != null ? !channelId.equals(that.channelId) : that.channelId != null) return false;
        if (wareId != null ? !wareId.equals(that.wareId) : that.wareId != null) return false;
        if (wareName != null ? !wareName.equals(that.wareName) : that.wareName != null) return false;
        if (normalStock != null ? !normalStock.equals(that.normalStock) : that.normalStock != null) return false;
        if (currentNumber != null ? !currentNumber.equals(that.currentNumber) : that.currentNumber != null)
            return false;
        if (incrementNumber != null ? !incrementNumber.equals(that.incrementNumber) : that.incrementNumber != null)
            return false;
        if (isSpecial != null ? !isSpecial.equals(that.isSpecial) : that.isSpecial != null) return false;
        if (lastTime != null ? !lastTime.equals(that.lastTime) : that.lastTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (channelId != null ? channelId.hashCode() : 0);
        result = 31 * result + (wareId != null ? wareId.hashCode() : 0);
        result = 31 * result + (wareName != null ? wareName.hashCode() : 0);
        result = 31 * result + (normalStock != null ? normalStock.hashCode() : 0);
        result = 31 * result + (currentNumber != null ? currentNumber.hashCode() : 0);
        result = 31 * result + (incrementNumber != null ? incrementNumber.hashCode() : 0);
        result = 31 * result + (isSpecial != null ? isSpecial.hashCode() : 0);
        result = 31 * result + (lastTime != null ? lastTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "NODE_ID", referencedColumnName = "NODE_ID", nullable = false)
    public NodeInfoEntity getNodeInfoByNodeId() {
        return nodeInfoByNodeId;
    }

    public void setNodeInfoByNodeId(NodeInfoEntity nodeInfoByNodeId) {
        this.nodeInfoByNodeId = nodeInfoByNodeId;
    }
}
