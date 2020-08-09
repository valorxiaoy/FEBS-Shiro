package cc.mrbird.febs.appmedical.service;

import cc.mrbird.febs.organizationalmanagement.entity.Staff;

import java.text.ParseException;

public interface PersonalService {
    /**
     *  根据手机号查询个人信息
     * @param phone
     * @return
     */
    Staff selectPhoneByKey(Integer phone);

    /**
     * 通过手机号码修改信息
     * @param staff
     */
    void updatePhoneByKey(Staff staff) throws ParseException;
}
