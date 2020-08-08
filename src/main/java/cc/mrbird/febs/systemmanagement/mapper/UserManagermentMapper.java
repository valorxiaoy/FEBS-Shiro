package cc.mrbird.febs.systemmanagement.mapper;

import cc.mrbird.febs.systemmanagement.entity.UserT;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface UserManagermentMapper {

    /**
     *  添加新用户
     */
    void addUser(UserT user);

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

    void updateUserByKey(UserT user);

    /**
     *  查询所有的用户
     */

    Page<UserT> findAll();
}
