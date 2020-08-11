package cc.mrbird.febs.appmedical.service;

import cc.mrbird.febs.appmedical.entity.Pwd;
import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import cc.mrbird.febs.systemmanagement.entity.UserT;

import java.text.ParseException;

public interface PersonalService {
    /**
     *  根据手机号查询个人信息
     * @param mobile
     * @return
     */
    UserT selectPhoneByKey(String mobile);

    /**
     * 通过手机号码修改信息
     * @param user
     */
    void updatePhoneByKey(UserT user) throws ParseException;

    /**
     * 修改密码
     * @param pwd
     */
    void updatePwd(Pwd pwd);

    UserT selectUserPhoneByKey(String phone);
}
