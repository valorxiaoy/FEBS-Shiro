package cc.mrbird.febs.systemmanagement.controller;

import cc.mrbird.febs.systemmanagement.entity.PageResult;
import cc.mrbird.febs.systemmanagement.entity.QueryPageBean;
import cc.mrbird.febs.systemmanagement.entity.Result;
import cc.mrbird.febs.systemmanagement.entity.UserT;
import cc.mrbird.febs.systemmanagement.service.UserManagementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserManagementController {

    @Autowired
    private UserManagementService userManagementService;

    @ApiOperation("新增")
    @RequestMapping(value = "/usert/addUser",method = RequestMethod.POST)
    public Result addUser(@RequestBody UserT user){
        try {
            UserT flag = userManagementService.selectUserByKey(user.getUsername());
            if (flag != null){
                return new Result(false,"对不起你添加的用户已存在");
            }
            userManagementService.addUser(user);
            return  new Result(true,"添加用户成功");
        } catch (Exception e) {
            e.printStackTrace();
            return  new Result(false,"添加用户失败");
        }
    }

    @ApiOperation("根据用户名删除")
    @GetMapping("/usert/deleteUserByKey")
    public Result deleteUserByKey(String username){
        try {
            userManagementService.deleteUserByKey(username);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }
    @ApiOperation("根据用户名查询")
    @GetMapping("/usert/selectUserByKey/{username}")
    public Result selectUserByKey(@PathVariable("username") String username){

        UserT user = userManagementService.selectUserByKey(username);
        if (user !=null){
            return new Result(true,"查询成功",user);
        }else {
            return new Result(false,"查询失败");
        }
    }
    @ApiOperation("修改用户信息")
    @RequestMapping("/usert/updateUserByKey")
    public Result updateUserByKey(@RequestBody UserT user){
        try {
            UserT flag = userManagementService.selectUserByKey(user.getUsername());
            if (flag != null){
                userManagementService.updateUserByKey(user);
            }else {
                return new Result(false,"对不起你修改的用户不存在");
            }
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }


    @RequestMapping(value = "/usert/findAll",method = RequestMethod.POST)
    public PageResult findAll(@RequestBody QueryPageBean queryPageBean){
        PageResult findAll = userManagementService.findAll(queryPageBean.getCurrentPage(), queryPageBean.getCurrentPage());
        return findAll;
    }

}
