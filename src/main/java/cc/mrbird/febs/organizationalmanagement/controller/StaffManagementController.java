package cc.mrbird.febs.organizationalmanagement.controller;

import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import cc.mrbird.febs.organizationalmanagement.service.StaffService;
import cc.mrbird.febs.systemmanagement.entity.PageResult;
import cc.mrbird.febs.systemmanagement.entity.QueryPageBean;
import cc.mrbird.febs.systemmanagement.entity.Result;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/staff")
public class StaffManagementController {

    @Autowired
    private StaffService staffService;

    @ApiOperation("添加新职工")
    @RequestMapping(value = "/addStaff",method = RequestMethod.POST)
    public Result addStaff(@RequestBody Staff staff){
        try {
            String identityCardFront = staff.getIdentityCardFront();
            Staff flag = staffService.selectStaffByKey(identityCardFront);
            if (flag != null){
                return new Result(false,"你的身份已存在");
            }else {
                staffService.addStaff(staff);
                return new Result(true,"添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }

    @ApiOperation("根据身份删除")
    @GetMapping("/deleteStaffByKey/{identityCardFront}")
    public Result deleteStaffByKey(@PathVariable("identityCardFront") String identityCardFront){
        try {
            staffService.deleteStaffByKey(identityCardFront);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @ApiOperation("分页查询")
    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public PageResult findAll(@RequestBody QueryPageBean queryPageBean){
        PageResult all = staffService.findAll(queryPageBean.getCurrentPage(), queryPageBean.getPageSize()
        ,queryPageBean.getQueryString());
        return all;
    }

    @ApiOperation("按照身份进行查找")
    @GetMapping("/selectStaffByKey/{identityCardFront}")
    public Result selectStaffByKey(@PathVariable("identityCardFront") String identityCardFront){

        Staff staff = staffService.selectStaffByKey(identityCardFront);
        if (staff!=null){
            return new Result(true,"查询成功");
        }
            return new Result(false,"查询失败");
    }


    @ApiOperation("根据身份进行修改")
    @RequestMapping(value = "/updateStaffByKey",method = RequestMethod.POST)
    public Result updateStaffByKey(@RequestBody Staff staff){

        try {
            Staff staff1 = staffService.selectStaffByKey(staff.getIdentityCardFront());
            if (staff1 == null){
                return new Result(false,"你修改的信息不存在");
            }
            staffService.updateByKey(staff);
            return new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }


}
