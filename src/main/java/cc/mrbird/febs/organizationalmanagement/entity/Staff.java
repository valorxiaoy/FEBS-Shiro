package cc.mrbird.febs.organizationalmanagement.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;


public class Staff implements Serializable {
   private  int         id;
   private  String      region;
   private  String      staffName;
   private  int         gender;
   private  String      qualification;
   private  String      post;
   private  int         phone;
   private  String      site;
   private  int         certificationStatus;
   private  String      subsidiaryOrgan;
   private  String      identityCardFront;
   private  String      identityCardContrary;
   private  String      jobStatusFront;
   private  String      jobStatusContrary;
   private  int         createUid;
   private  Date        createTime;
   private  int         updateUid;
   private  Date        updateTime;
   private  String      remark;
   private int      age;
   private String birthday;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return qualification;
    }

    public void setStatus(String qualification) {
        this.qualification = qualification;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getCertificationStatus() {
        return certificationStatus;
    }

    public void setCertificationStatus(int certificationStatus) {
        this.certificationStatus = certificationStatus;
    }

    public String getSubsidiaryOrgan() {
        return subsidiaryOrgan;
    }

    public void setSubsidiaryOrgan(String subsidiaryOrgan) {
        this.subsidiaryOrgan = subsidiaryOrgan;
    }

    public String getIdentityCardFront() {
        return identityCardFront;
    }

    public void setIdentityCardFront(String identityCardFront) {
        this.identityCardFront = identityCardFront;
    }

    public String getIdentityCardContrary() {
        return identityCardContrary;
    }

    public void setIdentityCardContrary(String identityCardContrary) {
        this.identityCardContrary = identityCardContrary;
    }

    public String getJobStatusFront() {
        return jobStatusFront;
    }

    public void setJobStatusFront(String jobStatusFront) {
        this.jobStatusFront = jobStatusFront;
    }

    public String getJobStatusContrary() {
        return jobStatusContrary;
    }

    public void setJobStatusContrary(String jobStatusContrary) {
        this.jobStatusContrary = jobStatusContrary;
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
