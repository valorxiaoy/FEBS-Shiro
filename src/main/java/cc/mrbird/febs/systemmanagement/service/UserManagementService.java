package cc.mrbird.febs.systemmanagement.service;


import cc.mrbird.febs.systemmanagement.entity.PageResult;
import cc.mrbird.febs.systemmanagement.entity.UserT;
import org.apache.ibatis.annotations.Param;

import java.text.ParseException;

public interface UserManagementService {

    /**
     *  添加新用户
     */
    void addUser(UserT user) throws ParseException;

    /**
     *  根据用户名删除
     * @param username
     */
    void deleteUserByKey(String username);


    /**
     *  根据用户名查询用户信息
     */

    UserT selectUserByKey(@Param("username") String username);


    /**
     * 根据用户名进行修改
     */

    void updateUserByKey(UserT user) throws ParseException;

    /**
     * 分页查询所有用户
     */
    PageResult findAll(Integer currentPage, Integer pageSize);
}
