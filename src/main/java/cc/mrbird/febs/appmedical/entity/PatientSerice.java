package cc.mrbird.febs.appmedical.entity;

import java.io.Serializable;
import java.util.Date;

public class PatientSerice implements Serializable {

    private int id;
   private String patientName;
   private Date servicTime;
   private int servicStrat;
   private String remark;
   private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getServicTime() {
        return servicTime;
    }

    public void setServicTime(Date servicTime) {
        this.servicTime = servicTime;
    }

    public int getServicStrat() {
        return servicStrat;
    }

    public void setServicStrat(int servicStrat) {
        this.servicStrat = servicStrat;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}