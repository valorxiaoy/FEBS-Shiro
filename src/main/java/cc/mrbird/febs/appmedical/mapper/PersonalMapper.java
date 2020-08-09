package cc.mrbird.febs.appmedical.mapper;

import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import org.apache.ibatis.annotations.Param;

public interface PersonalMapper {

    /**
     *  根据手机号查询个人信息
     * @param phone
     * @return
     */
    Staff selectPhoneByKey(@Param("phone") Integer phone);

    /**
     * 通过手机号码修改信息
     * @param staff
     */
    void updatePhoneByKey(Staff staff);
}
