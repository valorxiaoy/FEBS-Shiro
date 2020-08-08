package cc.mrbird.febs.organizationalmanagement.mapper;

import cc.mrbird.febs.organizationalmanagement.entity.HospitalSerice;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface HospitalSericeMapper {

    /**
     *  根据服务编号进行查找
     * @param sericeSerial
     * @return
     */
    HospitalSerice selectSeriaByKey(@Param("sericeSerial") String sericeSerial);

    /**
     *  添加服务显目
     * @param hospitalSerice
     */
    void add(HospitalSerice hospitalSerice);

    /**
     *  根据服务编号进行删除
     * @param sericeSerial
     */
    void deleteSerialByKey(String sericeSerial);

    /**
     *     根据服务编号进行修改
     * @param hospitalSerice
     */
    void updateSericeByKey(HospitalSerice hospitalSerice);

    /**
     *  按条件分页查询
     * @param queryString
     * @return
     */
    Page<HospitalSerice> findAll(String queryString);
}
