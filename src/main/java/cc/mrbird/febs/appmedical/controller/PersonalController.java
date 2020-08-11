package cc.mrbird.febs.appmedical.controller;

import cc.mrbird.febs.appmedical.entity.AliYun;
import cc.mrbird.febs.appmedical.entity.Pwd;
import cc.mrbird.febs.appmedical.entity.ValidateCodeUtils;
import cc.mrbird.febs.appmedical.service.PersonalService;
import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import cc.mrbird.febs.systemmanagement.entity.Result;
import cc.mrbird.febs.systemmanagement.entity.UserT;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Slf4j
@ApiModel("个人中心")
@RestController
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    private PersonalService personalService;

    @ApiOperation("通过手机号码查询个人信息")
    @GetMapping("/selectPhoneByKey/{phone}")
    public Result selectPhoneByKey(@PathVariable("phone") String phone){

        try {
            UserT user= personalService.selectPhoneByKey(phone);
            return new Result(true,"查询成功",user);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true,"查询失败");
        }
    }

    @ApiOperation("通过手机号修改个人信息")
    @RequestMapping(value = "/updatePhoneByKey",method = RequestMethod.POST)
    public Result updatePhoneByKey(@RequestBody UserT user){
        try {
            String mobile = user.getMobile();
            UserT user1 = personalService.selectPhoneByKey(mobile);
            if (user1 == null){
                return new Result(false,"你修改的用户信息不存在");
            }
            personalService.updatePhoneByKey(user);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

   /* @ApiOperation("修改密码")
    @RequestMapping(value = "/updatePwd",method = RequestMethod.POST)
    public Result updatePwd(@RequestBody Pwd pwd){

        try {


            UserT user = personalService.selectUserPhoneByKey(pwd.getPhnoe());
            if (user == null){
                return new Result(false,"你输入的手机号不存在");
            }


            return new Result(false,"修改失败");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }

    }
*/
}
