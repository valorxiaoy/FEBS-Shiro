package cc.mrbird.febs.organizationalmanagement.service;


import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import cc.mrbird.febs.systemmanagement.entity.PageResult;
import org.apache.ibatis.annotations.Param;

import java.text.ParseException;

public interface StaffService {


    /**
     *  添加新职工
     */
    void addStaff(Staff staff) throws ParseException;

    /**
     *  根据身份查询
     */
    Staff selectStaffByKey( String identityCardFront);

    /**
     *  根据身份进行删除
     */
    void deleteStaffByKey( String identityCardFront);

    /**
     *  分页查询所有职工
     */
    PageResult findAll(Integer currentPage, Integer pageSize, String queryString);

    /**
     *  根据身份进行修改
     * @param staff
     */
    void updateByKey( Staff staff);
}
