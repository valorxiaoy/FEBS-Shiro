package cc.mrbird.febs.organizationalmanagement.entity;

import java.io.Serializable;
import java.util.Date;

public class HospitalSerice implements Serializable {

    private int id;
    private int  parentingWay;
    private String  parentingName;
    private String  sericeSerial;
    private int  cost;
    private int  state   ;
    private int  createUid;
    private Date createTime ;
    private int  updateUid ;
    private Date  updateTime ;
    private String  remark;
    private String narrate;


    public String getNarrate() {
        return narrate;
    }

    public void setNarrate(String narrate) {
        this.narrate = narrate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentingWay() {
        return parentingWay;
    }

    public void setParentingWay(int parentingWay) {
        this.parentingWay = parentingWay;
    }

    public String getParentingName() {
        return parentingName;
    }

    public void setParentingName(String parentingName) {
        this.parentingName = parentingName;
    }

    public String getSericeSerial() {
        return sericeSerial;
    }

    public void setSericeSerial(String sericeSerial) {
        this.sericeSerial = sericeSerial;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getCreateUid() {
        return createUid;
    }

    public void setCreateUid(int createUid) {
        this.createUid = createUid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(int updateUid) {
        this.updateUid = updateUid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
