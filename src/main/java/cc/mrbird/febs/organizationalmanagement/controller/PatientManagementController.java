package cc.mrbird.febs.organizationalmanagement.controller;

import cc.mrbird.febs.organizationalmanagement.entity.Patient;
import cc.mrbird.febs.organizationalmanagement.service.PatientService;
import cc.mrbird.febs.systemmanagement.entity.PageResult;
import cc.mrbird.febs.systemmanagement.entity.QueryPageBean;
import cc.mrbird.febs.systemmanagement.entity.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientManagementController {

    @Autowired
    private PatientService patientService;

    @ApiOperation("通过手机号码查询患者")
    @PostMapping("/selectPhoneByKey/{phone}")
    public Result selectPhoneByKey(@PathVariable("phone") Integer phone){
        try {
            Patient patient = patientService.selectPhoneByKey(phone);
            return new Result(true,"查询成功",patient);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"查询失败");
        }
    }

    @ApiOperation("添加患者")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(@RequestBody Patient patient){
        try {
            int phone = patient.getPhone();
            Patient patient1 = patientService.selectPhoneByKey(phone);
            if (patient1!=null){
                return new Result(false,"该手机已经注册过");
            }
            patientService.add(patient);
            return new Result(true,"添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }

    @ApiOperation("删除")
    @GetMapping("/deletePhoneByKey/{phone}")
    public Result deletePhoneByKey(@PathVariable("phone") Integer phone){
        try {
         patientService.deletePhoneByKey(phone);
         return new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
         return new Result(false,"删除失败");
        }
    }

    @ApiOperation("根据手机号码修改")
    @RequestMapping(value = "/updatePhoneByKey",method = RequestMethod.POST)
    public Result updatePhoneByKey(@RequestBody Patient patient){
        try {
            Patient patient1 = patientService.selectPhoneByKey(patient.getPhone());
            if (patient1 == null){
                return new Result(false,"你修改的信息不存在");
            }
            patientService.updatePhoneByKey(patient);
            return  new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"修改失败");
        }
    }

    @ApiOperation("分页查询")
    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public PageResult findAll(@RequestBody QueryPageBean queryPageBean){
        PageResult all = patientService.findAll(queryPageBean.getCurrentPage(), queryPageBean.getPageSize()
                ,queryPageBean.getQueryString());
        return all;
    }
}
