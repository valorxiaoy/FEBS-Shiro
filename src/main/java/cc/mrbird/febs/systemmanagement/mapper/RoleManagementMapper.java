package cc.mrbird.febs.systemmanagement.mapper;



import cc.mrbird.febs.systemmanagement.entity.RoleT;

import com.github.pagehelper.Page;
import io.lettuce.core.dynamic.annotation.Param;


/**
 *  角色的Mapper
 */
public interface RoleManagementMapper {

    /**
     *  根据id查询角色信息
     * @param roleId
     * @return
     */
    RoleT getRoleByKey(@Param("roleId") Integer roleId);

    /**
     *  添加角色
     * @param role
     */
    void addRole(RoleT role);

    /**
     *  查询所有的角色
     * @return
     */
    Page<RoleT> findAll();

    /**
     *  根据id 删除角色
     * @param roleId
     */
    void deleteByKey(@Param("roleId") Integer roleId);

    /**
     *  根据角色id 进行修改
     *
     */
    void updateByKey( RoleT role);

    /**
     * 根据roleId激活账号状态
     */
    void updateQualification(@Param("roleId") Integer roleId);


}
