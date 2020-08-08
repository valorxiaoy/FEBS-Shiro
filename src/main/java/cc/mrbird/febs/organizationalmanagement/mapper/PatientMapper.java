package cc.mrbird.febs.organizationalmanagement.mapper;

import cc.mrbird.febs.organizationalmanagement.entity.Patient;
import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface PatientMapper {



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
    void deletePhoneByKey(@Param("phone") Integer phone);

    void updatePhoneByKey(Patient patient);

    Page<Patient> findAll(String queryString);
}
