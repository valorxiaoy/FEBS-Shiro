package cc.mrbird.febs.appmedical.controller;

import cc.mrbird.febs.appmedical.service.PersonalService;
import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import cc.mrbird.febs.systemmanagement.entity.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    private PersonalService personalService;

    @ApiOperation("通过手机号码查询个人信息")
    @GetMapping("/selectPhoneByKey/{phone}")
    public Result selectPhoneByKey(@PathVariable("phone") Integer phone){

        try {
            Staff staff = personalService.selectPhoneByKey(phone);
            return new Result(true,"查询成功",staff);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true,"查询失败");
        }
    }

    @ApiOperation("通过手机号修改个人信息")
    @RequestMapping(value = "/updatePhoneByKey",method = RequestMethod.POST)
    public Result updatePhoneByKey(@RequestBody Staff staff){
        try {
            int phone = staff.getPhone();
            Staff staff1 = personalService.selectPhoneByKey(phone);
            if (staff1 == null){
                return new Result(false,"你修改的用户信息不存在");
            }
            personalService.updatePhoneByKey(staff);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

}
