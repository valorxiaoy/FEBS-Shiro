package cc.mrbird.febs.organizationalmanagement.controller;

import cc.mrbird.febs.organizationalmanagement.entity.Guardian;

import cc.mrbird.febs.organizationalmanagement.service.GuardianService;
import cc.mrbird.febs.systemmanagement.entity.PageResult;
import cc.mrbird.febs.systemmanagement.entity.QueryPageBean;
import cc.mrbird.febs.systemmanagement.entity.Result;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/guardian")
public class GuardianManagementController {

    @Autowired
    private GuardianService guardianService;

    @ApiOperation("通过手机号码查询患者")
    @PostMapping("/selectPhoneByKey/{phone}")
    public Result selectPhoneByKey(@PathVariable("phone") Integer phone){
        try {
            Guardian guardian = guardianService.selectPhoneByKey(phone);
            return new Result(true,"查询成功",guardian);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"查询失败");
        }
    }

    @ApiOperation("添加监护人")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(@RequestBody Guardian guardian){
        try {
            int phone = guardian.getPhone();
            Guardian guardian1 = guardianService.selectPhoneByKey(phone);
            if (guardian1!=null){
                return new Result(false,"该手机已经注册过");
            }
            guardianService.add(guardian);
            return new Result(true,"添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }

    @ApiOperation("根据电话号码删除")
    @GetMapping("/deletePhoneByKey/{phone}")
    public Result deletePhoneByKey(@PathVariable("phone") Integer phone){
        try {
            guardianService.deletePhoneByKey(phone);
            return new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @ApiOperation("修改")
    @RequestMapping("/updatePhoneByKey")
    public Result updatePhoneByKey(@RequestBody Guardian guardian){
        try {
            Guardian guardian1 = guardianService.selectPhoneByKey(guardian.getPhone());
            if (guardian1 == null){
                return new Result(false,"你修改的信息不存在");
            }
            guardianService.updatePhoneByKey(guardian);
            return  new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"修改失败");
        }
    }

    @ApiOperation("分页查询")
    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public PageResult findAll(@RequestBody QueryPageBean queryPageBean){
        PageResult all = guardianService.findAll(queryPageBean.getCurrentPage(), queryPageBean.getPageSize()
                ,queryPageBean.getQueryString());
        return all;
    }
}
