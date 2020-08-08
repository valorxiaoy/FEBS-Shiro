package cc.mrbird.febs.systemmanagement.controller;



import cc.mrbird.febs.systemmanagement.entity.PageResult;
import cc.mrbird.febs.systemmanagement.entity.QueryPageBean;
import cc.mrbird.febs.systemmanagement.entity.Result;

import cc.mrbird.febs.systemmanagement.entity.RoleT;
import cc.mrbird.febs.systemmanagement.service.RoleManagementService;
import io.swagger.annotations.*;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@ApiModel("角色设置")
@Slf4j
@RestController
@RequestMapping("/role")
public class RoleManagementController {

    @Autowired
    private RoleManagementService roleManagementService;

    @ApiOperation("根据roleid查询")
    @GetMapping("/getRoleByKey/{roleId}")
    public Result getRoleByKey(@PathVariable("roleId") String roleId){
        RoleT roleByKey = roleManagementService.getRoleByKey(Integer.parseInt(roleId));
        if (roleByKey !=null){
            return new Result(true,"查询成功",roleByKey);
        }
        return new Result(false,"查询失败");
    }
    @ApiOperation("新增")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addRole(@RequestBody  RoleT role){
       try {
           RoleT roleByKey = roleManagementService.getRoleByKey(role.getRoleId());
           if (roleByKey != null){
             return  new Result(false,"对不起你添加的角色id以存在");
           }
            roleManagementService.addRole(role);
           return  new Result(true,"添加成功");
       } catch (Exception e){
           e.printStackTrace();
           return new Result(false,"添加失败");
       }
    }
    @ApiOperation("分页查询所有的role")
    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public PageResult findAll(@RequestBody QueryPageBean queryPageBean){
        PageResult findAll = roleManagementService.findAll(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize());
        return findAll;
    }
    @ApiOperation("根据roleId删除")
    @GetMapping("/deleteByKey/{roleId}")
    public Result deleteByKey(@PathVariable("roleId") String roleId){
        try {
            roleManagementService.deleteByKey(Integer.parseInt(roleId));
            return  new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"删除失败");
        }
    }
    @ApiOperation("修改role")
    @RequestMapping(value = "/updateByKey",method = RequestMethod.POST)
    public Result updateByKey(@RequestBody RoleT role){
        try {
            int roleId = role.getRoleId();
            RoleT roleByKey = roleManagementService.getRoleByKey(roleId);
            if (roleByKey !=null) {
                roleManagementService.updateByKey(role);
            }else {
                return new Result(false,"您修改的用户不存在");
            }
            return new Result(true,"修改成功");
        } catch (Exception e){
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @GetMapping("/updateStatus/{roleId}")
    public Result updateQualification(@PathVariable("roleId") String roleId){
        try {
            roleManagementService.updateQualification(Integer.parseInt(roleId));
            return  new Result(true,"激活成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"激活失败");
        }
    }

}
