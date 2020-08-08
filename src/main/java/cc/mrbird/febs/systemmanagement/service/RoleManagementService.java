package cc.mrbird.febs.systemmanagement.service;

import cc.mrbird.febs.systemmanagement.entity.PageResult;
import cc.mrbird.febs.systemmanagement.entity.RoleT;



public interface RoleManagementService {

    /**
     *  根据id查询角色信息
     * @param roleId
     * @return
     */
    RoleT getRoleByKey(Integer roleId);
    /**
     *  添加角色
     * @param role
     */
    void addRole(RoleT role);

    /**
     *  分页查询所有的角色
     * @return
     */
    PageResult findAll(Integer currentPage, Integer pageSize);


    /**
     *  根据id 删除角色
     * @param roleId
     */
    void deleteByKey(Integer roleId);

    /**
     *  根据角色id 进行修改
     */
    void updateByKey( RoleT role);
    /**
     * 根据roleId激活资格
     */
    void updateQualification(Integer roleId);


}
