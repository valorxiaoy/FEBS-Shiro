package cc.mrbird.febs.organizationalmanagement.service;

import cc.mrbird.febs.organizationalmanagement.entity.Guardian;
import cc.mrbird.febs.systemmanagement.entity.PageResult;

public interface GuardianService {

    /**
     * 根据手机号码查询患者信息
     */
    Guardian selectPhoneByKey(Integer phone);

    /**
     *  添加监护人
     * @param guardian
     */
    void add(Guardian guardian);

    /**
     * 根据手机号码删除监护人
     * @param phone
     */
    void deletePhoneByKey(Integer phone);

    /**
     * 修改监护人信息
     * @param guardian
     */
    void updatePhoneByKey(Guardian guardian);

    /**
     * 分页查询
     * @return
     */
    PageResult findAll(Integer currentPage, Integer pageSize, String queryString);
}
