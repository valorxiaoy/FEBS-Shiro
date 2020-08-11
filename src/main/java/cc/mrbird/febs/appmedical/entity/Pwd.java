package cc.mrbird.febs.appmedical.entity;

import java.io.Serializable;

public class Pwd implements Serializable {

    private String phnoe;//手机号
    private String code;//验证码
    private String newPwd;//新密码
    private String repetitionPwd;//重复密码

    public Pwd() {
    }

    public Pwd(String phnoe) {
        this.phnoe = phnoe;
    }

    public Pwd(String code, String newPwd, String repetitionPwd) {
        this.code = code;
        this.newPwd = newPwd;
        this.repetitionPwd = repetitionPwd;
    }

    public String getPhnoe() {
        return phnoe;
    }

    public void setPhnoe(String phnoe) {
        this.phnoe = phnoe;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    public String getRepetitionPwd() {
        return repetitionPwd;
    }

    public void setRepetitionPwd(String repetitionPwd) {
        this.repetitionPwd = repetitionPwd;
    }
}
