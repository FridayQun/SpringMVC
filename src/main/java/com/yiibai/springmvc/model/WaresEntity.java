package com.yiibai.springmvc.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by lenovo on 2016/7/15.
 */
@Entity
@Table(name = "wares", schema = "xurong")
public class WaresEntity {

    private long wareId;
    private String wareCode;
    private String wareName;
    private String wareNorm;
    private String wareUnit;
    private Integer wareBasePrice;
    private String wareType;
    private Integer wareMaxPrice;
    private Integer wareMinPrice;
    private String wareDesc;
    private String wareSimpleCode;
    private Long count;
    private String wareStatus;
    private Timestamp lastTime;
    private Collection<ChannelGroupEntity> channelGroupsByWareId;
    private Collection<DepotEntity> depotsByWareId;

    @Id
    @Column(name = "WARE_ID")
    public long getWareId() {
        return wareId;
    }

    public void setWareId(long wareId) {
        this.wareId = wareId;
    }

    @Basic
    @Column(name = "WARE_CODE")
    public String getWareCode() {
        return wareCode;
    }

    public void setWareCode(String wareCode) {
        this.wareCode = wareCode;
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
    @Column(name = "WARE_NORM")
    public String getWareNorm() {
        return wareNorm;
    }

    public void setWareNorm(String wareNorm) {
        this.wareNorm = wareNorm;
    }

    @Basic
    @Column(name = "WARE_UNIT")
    public String getWareUnit() {
        return wareUnit;
    }

    public void setWareUnit(String wareUnit) {
        this.wareUnit = wareUnit;
    }

    @Basic
    @Column(name = "WARE_BASE_PRICE")
    public Integer getWareBasePrice() {
        return wareBasePrice;
    }

    public void setWareBasePrice(Integer wareBasePrice) {
        this.wareBasePrice = wareBasePrice;
    }

    @Basic
    @Column(name = "WARE_TYPE")
    public String getWareType() {
        return wareType;
    }

    public void setWareType(String wareType) {
        this.wareType = wareType;
    }

    @Basic
    @Column(name = "WARE_MAX_PRICE")
    public Integer getWareMaxPrice() {
        return wareMaxPrice;
    }

    public void setWareMaxPrice(Integer wareMaxPrice) {
        this.wareMaxPrice = wareMaxPrice;
    }

    @Basic
    @Column(name = "WARE_MIN_PRICE")
    public Integer getWareMinPrice() {
        return wareMinPrice;
    }

    public void setWareMinPrice(Integer wareMinPrice) {
        this.wareMinPrice = wareMinPrice;
    }

    @Basic
    @Column(name = "WARE_DESC")
    public String getWareDesc() {
        return wareDesc;
    }

    public void setWareDesc(String wareDesc) {
        this.wareDesc = wareDesc;
    }

    @Basic
    @Column(name = "WARE_SIMPLE_CODE")
    public String getWareSimpleCode() {
        return wareSimpleCode;
    }

    public void setWareSimpleCode(String wareSimpleCode) {
        this.wareSimpleCode = wareSimpleCode;
    }

    @Basic
    @Column(name = "COUNT")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Basic
    @Column(name = "WARE_STATUS")
    public String getWareStatus() {
        return wareStatus;
    }

    public void setWareStatus(String wareStatus) {
        this.wareStatus = wareStatus;
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

        WaresEntity that = (WaresEntity) o;

        if (wareId != that.wareId) return false;
        if (wareCode != null ? !wareCode.equals(that.wareCode) : that.wareCode != null) return false;
        if (wareName != null ? !wareName.equals(that.wareName) : that.wareName != null) return false;
        if (wareNorm != null ? !wareNorm.equals(that.wareNorm) : that.wareNorm != null) return false;
        if (wareUnit != null ? !wareUnit.equals(that.wareUnit) : that.wareUnit != null) return false;
        if (wareBasePrice != null ? !wareBasePrice.equals(that.wareBasePrice) : that.wareBasePrice != null)
            return false;
        if (wareType != null ? !wareType.equals(that.wareType) : that.wareType != null) return false;
        if (wareMaxPrice != null ? !wareMaxPrice.equals(that.wareMaxPrice) : that.wareMaxPrice != null) return false;
        if (wareMinPrice != null ? !wareMinPrice.equals(that.wareMinPrice) : that.wareMinPrice != null) return false;
        if (wareDesc != null ? !wareDesc.equals(that.wareDesc) : that.wareDesc != null) return false;
        if (wareSimpleCode != null ? !wareSimpleCode.equals(that.wareSimpleCode) : that.wareSimpleCode != null)
            return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (wareStatus != null ? !wareStatus.equals(that.wareStatus) : that.wareStatus != null) return false;
        if (lastTime != null ? !lastTime.equals(that.lastTime) : that.lastTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (wareId ^ (wareId >>> 32));
        result = 31 * result + (wareCode != null ? wareCode.hashCode() : 0);
        result = 31 * result + (wareName != null ? wareName.hashCode() : 0);
        result = 31 * result + (wareNorm != null ? wareNorm.hashCode() : 0);
        result = 31 * result + (wareUnit != null ? wareUnit.hashCode() : 0);
        result = 31 * result + (wareBasePrice != null ? wareBasePrice.hashCode() : 0);
        result = 31 * result + (wareType != null ? wareType.hashCode() : 0);
        result = 31 * result + (wareMaxPrice != null ? wareMaxPrice.hashCode() : 0);
        result = 31 * result + (wareMinPrice != null ? wareMinPrice.hashCode() : 0);
        result = 31 * result + (wareDesc != null ? wareDesc.hashCode() : 0);
        result = 31 * result + (wareSimpleCode != null ? wareSimpleCode.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (wareStatus != null ? wareStatus.hashCode() : 0);
        result = 31 * result + (lastTime != null ? lastTime.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "waresByWareId")
    public Collection<ChannelGroupEntity> getChannelGroupsByWareId() {
        return channelGroupsByWareId;
    }

    public void setChannelGroupsByWareId(Collection<ChannelGroupEntity> channelGroupsByWareId) {
        this.channelGroupsByWareId = channelGroupsByWareId;
    }

    @OneToMany(mappedBy = "waresByWareId")
    public Collection<DepotEntity> getDepotsByWareId() {
        return depotsByWareId;
    }

    public void setDepotsByWareId(Collection<DepotEntity> depotsByWareId) {
        this.depotsByWareId = depotsByWareId;
    }
}
