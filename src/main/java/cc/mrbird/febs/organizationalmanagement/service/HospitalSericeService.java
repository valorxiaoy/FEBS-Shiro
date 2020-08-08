package cc.mrbird.febs.organizationalmanagement.service;

import cc.mrbird.febs.organizationalmanagement.entity.HospitalSerice;
import cc.mrbird.febs.systemmanagement.entity.PageResult;

public interface HospitalSericeService {
    /**
     *  根据编号查询服务
     * @param sericeSerial
     * @return
     */
    HospitalSerice selectSeriaByKey(String sericeSerial);

    /**
     *  添加服务项目
     * @param hospitalSerice
     */
    void add(HospitalSerice hospitalSerice);

    /**
     *  根据服务项目编号删除
     * @param sericeSerial
     */
    void deleteSerialByKey(String sericeSerial);

    /**
     *  根据服务项目编号修改
     * @param hospitalSerice
     */
    void updateSericeByKey(HospitalSerice hospitalSerice);

    /**
     *  分页查询
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    PageResult findAll(Integer currentPage, Integer pageSize, String queryString);
}
