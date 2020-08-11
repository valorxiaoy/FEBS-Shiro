package cc.mrbird.febs.systemmanagement.entity;

import io.swagger.annotations.ApiParam;

import java.io.Serializable;
import java.util.Date;

public class UserT implements Serializable {

  private  int      userId;
  @ApiParam("用户名")
  private  String   username;
  private  String   password;
  private  int      deptId;
  private  String  email;
  private  String   mobile;
  private  int   status;
  private  Date    createTime;
  private  Date   modifyTime;
  private  Date  lastLoginTime;
  private  int     ssex;
  private  int       isTab;
  private  String    theme;
  private  String  avatar;
  private  String  description;
  private  String  organizationCoding;
  private  String  regionCoding;
  private  String  name;
  private  String  qualification;
  private  String  site;
  private  int     certificationStatus;
  private  int     certificate;
  private int age;
  private String birthday;
  private String organizationName;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSsex() {
        return ssex;
    }

    public void setSsex(int ssex) {
        this.ssex = ssex;
    }

    public int getIsTab() {
        return isTab;
    }

    public void setIsTab(int isTab) {
        this.isTab = isTab;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrganizationCoding() {
        return organizationCoding;
    }

    public void setOrganizationCoding(String organizationCoding) {
        this.organizationCoding = organizationCoding;
    }

    public String getRegionCoding() {
        return regionCoding;
    }

    public void setRegionCoding(String regionCoding) {
        this.regionCoding = regionCoding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
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

    public int getCertificate() {
        return certificate;
    }

    public void setCertificate(int certificate) {
        this.certificate = certificate;
    }
}