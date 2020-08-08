package cc.mrbird.febs.organizationalmanagement.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;


public class Patient implements Serializable {
   private int id;
   private String   region;
   private String   classify;
   private String   name;
   private int   gender;
   private int      age;
   private int      phone;

   private int      guardianId;
   private String   areaCode;
   private String   faceReco;
   private String   entrustTheWy;

   private String   site;
   private String   diagnosis;
   private String   affiliatedHospital;
   private int      createUid;
   private Date     createTime;
   private Date     updateTime;
   private int      updateUid;
   private String   remark;

    public int getGuardianId() {
        return guardianId;
    }

    public void setGuardianId(int guardianId) {
        this.guardianId = guardianId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getFaceReco() {
        return faceReco;
    }

    public void setFaceReco(String faceReco) {
        this.faceReco = faceReco;
    }

    public String getEntrustTheWy() {
        return entrustTheWy;
    }

    public void setEntrustTheWy(String entrustTheWy) {
        this.entrustTheWy = entrustTheWy;
    }

    private String entrust_the_way;

    public String getEntrust_the_way() {
        return entrust_the_way;
    }

    public void setEntrust_the_way(String entrust_the_way) {
        this.entrust_the_way = entrust_the_way;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getFace_reco() {
        return face_reco;
    }

    public void setFace_reco(String face_reco) {
        this.face_reco = face_reco;
    }

    private String area_code;

   private String face_reco;

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

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getAffiliatedHospital() {
        return affiliatedHospital;
    }

    public void setAffiliatedHospital(String affiliatedHospital) {
        this.affiliatedHospital = affiliatedHospital;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(int updateUid) {
        this.updateUid = updateUid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
