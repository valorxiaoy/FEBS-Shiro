package cc.mrbird.febs.systemmanagement.service.impl;

import cc.mrbird.febs.organizationalmanagement.entity.AgeUtils;
import cc.mrbird.febs.systemmanagement.entity.PageResult;
import cc.mrbird.febs.systemmanagement.entity.UserT;
import cc.mrbird.febs.systemmanagement.mapper.UserManagermentMapper;
import cc.mrbird.febs.systemmanagement.service.UserManagementService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    private UserManagermentMapper userManagermentMapper;


    @Override
    public void addUser(UserT user) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );

        int ageByBirth = AgeUtils.getAgeByBirth(sdf.parse(user.getBirthday()));
        user.setAge(ageByBirth);
        user.setCreateTime(new Date());
        user.setModifyTime(new Date());
        userManagermentMapper.addUser(user);
        return;
    }

    @Override
    public void deleteUserByKey(String username) {
        userManagermentMapper.deleteUserByKey(username);
        return;
    }

    @Override
    public UserT selectUserByKey(String username) {
        return userManagermentMapper.selectUserByKey(username);
    }

    @Override
    public void updateUserByKey( UserT user) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );

        int ageByBirth = AgeUtils.getAgeByBirth(sdf.parse(user.getBirthday()));
        user.setAge(ageByBirth);

        user.setModifyTime(new Date());
        userManagermentMapper.updateUserByKey(user);
         return;
    }

    @Override
    public PageResult findAll(Integer currentPage, Integer pageSize) {

        // 使用分页插件
        PageHelper.startPage(currentPage,pageSize);
        Page<UserT> userList = userManagermentMapper.findAll();
        return new PageResult(userList.getTotal(),userList.getResult());
    }


}
