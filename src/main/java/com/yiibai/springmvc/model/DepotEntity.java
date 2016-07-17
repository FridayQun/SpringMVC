package com.yiibai.springmvc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lenovo on 2016/7/15.
 */
@Entity
@Table(name = "depot", schema = "xurong")
public class DepotEntity {

    private long depotId;
    private String employeeName;
    private String depotWareName;
    private Integer depotWareNum;
    private Integer depotWarePrice;
    private String depotType;
    private String depotOperator;
    private String remark;
    private Timestamp lastTime;
    private WaresEntity waresByWareId;
    private ShippingEntity shippingByShippingId;

    @Id
    @Column(name = "DEPOT_ID")
    public long getDepotId() {
        return depotId;
    }

    public void setDepotId(long depotId) {
        this.depotId = depotId;
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
    @Column(name = "DEPOT_WARE_NAME")
    public String getDepotWareName() {
        return depotWareName;
    }

    public void setDepotWareName(String depotWareName) {
        this.depotWareName = depotWareName;
    }

    @Basic
    @Column(name = "DEPOT_WARE_NUM")
    public Integer getDepotWareNum() {
        return depotWareNum;
    }

    public void setDepotWareNum(Integer depotWareNum) {
        this.depotWareNum = depotWareNum;
    }

    @Basic
    @Column(name = "DEPOT_WARE_PRICE")
    public Integer getDepotWarePrice() {
        return depotWarePrice;
    }

    public void setDepotWarePrice(Integer depotWarePrice) {
        this.depotWarePrice = depotWarePrice;
    }

    @Basic
    @Column(name = "DEPOT_TYPE")
    public String getDepotType() {
        return depotType;
    }

    public void setDepotType(String depotType) {
        this.depotType = depotType;
    }

    @Basic
    @Column(name = "DEPOT_OPERATOR")
    public String getDepotOperator() {
        return depotOperator;
    }

    public void setDepotOperator(String depotOperator) {
        this.depotOperator = depotOperator;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

        DepotEntity that = (DepotEntity) o;

        if (depotId != that.depotId) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;
        if (depotWareName != null ? !depotWareName.equals(that.depotWareName) : that.depotWareName != null)
            return false;
        if (depotWareNum != null ? !depotWareNum.equals(that.depotWareNum) : that.depotWareNum != null) return false;
        if (depotWarePrice != null ? !depotWarePrice.equals(that.depotWarePrice) : that.depotWarePrice != null)
            return false;
        if (depotType != null ? !depotType.equals(that.depotType) : that.depotType != null) return false;
        if (depotOperator != null ? !depotOperator.equals(that.depotOperator) : that.depotOperator != null)
            return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (lastTime != null ? !lastTime.equals(that.lastTime) : that.lastTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (depotId ^ (depotId >>> 32));
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (depotWareName != null ? depotWareName.hashCode() : 0);
        result = 31 * result + (depotWareNum != null ? depotWareNum.hashCode() : 0);
        result = 31 * result + (depotWarePrice != null ? depotWarePrice.hashCode() : 0);
        result = 31 * result + (depotType != null ? depotType.hashCode() : 0);
        result = 31 * result + (depotOperator != null ? depotOperator.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (lastTime != null ? lastTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "WARE_ID", referencedColumnName = "WARE_ID")
    public WaresEntity getWaresByWareId() {
        return waresByWareId;
    }

    public void setWaresByWareId(WaresEntity waresByWareId) {
        this.waresByWareId = waresByWareId;
    }

    @ManyToOne
    @JoinColumn(name = "SHIPPING_ID", referencedColumnName = "ID")
    public ShippingEntity getShippingByShippingId() {
        return shippingByShippingId;
    }

    public void setShippingByShippingId(ShippingEntity shippingByShippingId) {
        this.shippingByShippingId = shippingByShippingId;
    }
}
