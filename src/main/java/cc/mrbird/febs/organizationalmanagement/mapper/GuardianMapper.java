package cc.mrbird.febs.organizationalmanagement.mapper;

import cc.mrbird.febs.organizationalmanagement.entity.Guardian;
import cc.mrbird.febs.organizationalmanagement.entity.Patient;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;


public interface GuardianMapper {

    /**
     * 根据手机号码查询患者信息
     */
    Guardian selectPhoneByKey(@Param("phone") Integer phone);

    /**
     * 添加监护人
     * @param guardian
     */
    void add(Guardian guardian);

    /**
     *  根据手机号码删除监护人
     * @param phone
     */
    void deletePhoneByKey(Integer phone);

    /**
     *  修改监护人信息
     * @param guardian
     */
    void updatePhoneByKey(Guardian guardian);

    /**
     *  分页查询
     * @param queryString
     * @return
     */
    Page<Guardian> findAll(String queryString);
}
