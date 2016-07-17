package com.yiibai.springmvc.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by lenovo on 2016/7/15.
 */
@Entity
@Table(name = "shipping", schema = "xurong")
public class ShippingEntity {

    private long id;
    private String shippingId;
    private String depotDay;
    private String employeeName;
    private Integer moneyThis;
    private Integer moneyAll;
    private String humanName;
    private String wareHouse;
    private String driverName;
    private String operator;
    private String tableor;
    private String remark;
    private Timestamp lastTime;
    private Collection<DepotEntity> depotsById;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SHIPPING_ID")
    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    @Basic
    @Column(name = "DEPOT_DAY")
    public String getDepotDay() {
        return depotDay;
    }

    public void setDepotDay(String depotDay) {
        this.depotDay = depotDay;
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
    @Column(name = "Money_THIS")
    public Integer getMoneyThis() {
        return moneyThis;
    }

    public void setMoneyThis(Integer moneyThis) {
        this.moneyThis = moneyThis;
    }

    @Basic
    @Column(name = "Money_ALL")
    public Integer getMoneyAll() {
        return moneyAll;
    }

    public void setMoneyAll(Integer moneyAll) {
        this.moneyAll = moneyAll;
    }

    @Basic
    @Column(name = "HUMAN_NAME")
    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    @Basic
    @Column(name = "WARE_HOUSE")
    public String getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(String wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Basic
    @Column(name = "DRIVER_NAME")
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Basic
    @Column(name = "OPERATOR")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "TABLEOR")
    public String getTableor() {
        return tableor;
    }

    public void setTableor(String tableor) {
        this.tableor = tableor;
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

        ShippingEntity that = (ShippingEntity) o;

        if (id != that.id) return false;
        if (shippingId != null ? !shippingId.equals(that.shippingId) : that.shippingId != null) return false;
        if (depotDay != null ? !depotDay.equals(that.depotDay) : that.depotDay != null) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;
        if (moneyThis != null ? !moneyThis.equals(that.moneyThis) : that.moneyThis != null) return false;
        if (moneyAll != null ? !moneyAll.equals(that.moneyAll) : that.moneyAll != null) return false;
        if (humanName != null ? !humanName.equals(that.humanName) : that.humanName != null) return false;
        if (wareHouse != null ? !wareHouse.equals(that.wareHouse) : that.wareHouse != null) return false;
        if (driverName != null ? !driverName.equals(that.driverName) : that.driverName != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (tableor != null ? !tableor.equals(that.tableor) : that.tableor != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (lastTime != null ? !lastTime.equals(that.lastTime) : that.lastTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (shippingId != null ? shippingId.hashCode() : 0);
        result = 31 * result + (depotDay != null ? depotDay.hashCode() : 0);
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (moneyThis != null ? moneyThis.hashCode() : 0);
        result = 31 * result + (moneyAll != null ? moneyAll.hashCode() : 0);
        result = 31 * result + (humanName != null ? humanName.hashCode() : 0);
        result = 31 * result + (wareHouse != null ? wareHouse.hashCode() : 0);
        result = 31 * result + (driverName != null ? driverName.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (tableor != null ? tableor.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (lastTime != null ? lastTime.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "shippingByShippingId")
    public Collection<DepotEntity> getDepotsById() {
        return depotsById;
    }

    public void setDepotsById(Collection<DepotEntity> depotsById) {
        this.depotsById = depotsById;
    }
}
