package cc.mrbird.febs.organizationalmanagement.service;

import cc.mrbird.febs.organizationalmanagement.entity.Patient;
import cc.mrbird.febs.systemmanagement.entity.PageResult;
import org.apache.ibatis.annotations.Param;

public interface PatientService {

    /**
     * 根据手机号码查询患者信息
     */
    Patient selectPhoneByKey(@Param("phone") Integer phone);


    /**
     *  添加患者
     * @param patient
     */
    void add(Patient patient);

    /**
     *  根据手机号码删除
     */
    void deletePhoneByKey( Integer phone);

    void updatePhoneByKey(Patient patient);

    PageResult findAll(Integer currentPage, Integer pageSize, String queryString);
}
