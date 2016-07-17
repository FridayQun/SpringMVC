package com.yiibai.springmvc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lenovo on 2016/7/15.
 */
@Entity
@Table(name = "channel_group", schema = "xurong")
public class ChannelGroupEntity {

    private long id;
    private String versionName;
    private String channelId;
    private Integer normalStock;
    private Integer stdOut;
    private String type;
    private String des;
    private Timestamp lastTime;
    private WaresEntity waresByWareId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "CHANNEL_ID")
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
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
    @Column(name = "STD_OUT")
    public Integer getStdOut() {
        return stdOut;
    }

    public void setStdOut(Integer stdOut) {
        this.stdOut = stdOut;
    }

    @Basic
    @Column(name = "TYPE")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "DES")
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
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

        ChannelGroupEntity that = (ChannelGroupEntity) o;

        if (id != that.id) return false;
        if (versionName != null ? !versionName.equals(that.versionName) : that.versionName != null) return false;
        if (channelId != null ? !channelId.equals(that.channelId) : that.channelId != null) return false;
        if (normalStock != null ? !normalStock.equals(that.normalStock) : that.normalStock != null) return false;
        if (stdOut != null ? !stdOut.equals(that.stdOut) : that.stdOut != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (des != null ? !des.equals(that.des) : that.des != null) return false;
        if (lastTime != null ? !lastTime.equals(that.lastTime) : that.lastTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (versionName != null ? versionName.hashCode() : 0);
        result = 31 * result + (channelId != null ? channelId.hashCode() : 0);
        result = 31 * result + (normalStock != null ? normalStock.hashCode() : 0);
        result = 31 * result + (stdOut != null ? stdOut.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (des != null ? des.hashCode() : 0);
        result = 31 * result + (lastTime != null ? lastTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "WARE_ID", referencedColumnName = "WARE_ID", nullable = false)
    public WaresEntity getWaresByWareId() {
        return waresByWareId;
    }

    public void setWaresByWareId(WaresEntity waresByWareId) {
        this.waresByWareId = waresByWareId;
    }
}
