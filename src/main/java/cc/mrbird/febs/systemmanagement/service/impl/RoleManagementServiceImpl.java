package cc.mrbird.febs.systemmanagement.service.impl;


import cc.mrbird.febs.systemmanagement.entity.PageResult;
import cc.mrbird.febs.systemmanagement.entity.RoleT;
import cc.mrbird.febs.systemmanagement.mapper.RoleManagementMapper;
import cc.mrbird.febs.systemmanagement.service.RoleManagementService;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class RoleManagementServiceImpl implements RoleManagementService {

    @Autowired
    private RoleManagementMapper roleManagementMapper;

    @Override
    public RoleT getRoleByKey(Integer roleId) {
        return roleManagementMapper.getRoleByKey(roleId);
    }

    @Override
    public void addRole(RoleT role) {
        role.setCreateTime(new Date());
        role.setModifyTime(new Date());
        roleManagementMapper.addRole(role);
        return;
    }

    @Override
    public PageResult findAll(Integer currentPage, Integer pageSize) {

        // 使用分页查询插件
        PageHelper.startPage(currentPage,pageSize);
        Page<RoleT> all = roleManagementMapper.findAll();

        return new PageResult(all.getTotal(),all.getResult());
    }


    @Override
    public void deleteByKey(Integer roleId) {
            roleManagementMapper.deleteByKey(roleId);
        return;
    }

    @Override
    public void updateByKey(RoleT role) {
        role.setModifyTime(new Date());
        roleManagementMapper.updateByKey(role);
        return;
    }

    @Override
    public void updateQualification(Integer roleId) {

        roleManagementMapper.updateQualification(roleId);
        return;
    }


}
