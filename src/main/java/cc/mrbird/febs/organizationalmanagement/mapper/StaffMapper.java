package cc.mrbird.febs.organizationalmanagement.mapper;

import cc.mrbird.febs.organizationalmanagement.entity.Patient;
import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {



    /**
     *  添加新职工
     */
     void addStaff(Staff staff);

    /**
     *  根据身份查询
     */
    Staff selectStaffByKey(@Param("identityCardFront") String identityCardFront);

    /**
     *  根据身份进行删除
     */
    void deleteStaffByKey(@Param("identityCardFront") String identityCardFront);

    /**
     *  查询所有职工
     */
    Page<Patient> findAll(String queryString);

    /**
     *  根据身份进行修改
     *
     */
    void updateByKey(Staff staff);
}
