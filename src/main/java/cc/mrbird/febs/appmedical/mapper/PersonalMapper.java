package cc.mrbird.febs.appmedical.mapper;

import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import cc.mrbird.febs.systemmanagement.entity.UserT;
import org.apache.ibatis.annotations.Param;

public interface PersonalMapper {

    /**
     *  根据手机号查询个人信息
     * @param
     * @return
     */
    UserT selectPhoneByKey(@Param("mobile") String mobile);

    /**
     * 通过手机号码修改信息
     * @param
     */
    void updatePhoneByKey(UserT user);

    /**
     * 修改密码
     * @param phone
     * @param newPwd
     */
    void updatePwd(String phone, String newPwd);

    /**
     *  根据手机号是否存在
     * @param
     * @return
     */
    UserT selectUserPhoneByKey(@Param("mobile") String mobile);
}
